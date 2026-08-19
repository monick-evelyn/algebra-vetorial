package sistema;
import model.*;

import model.Vetor2D;
import model.Vetor3D;

public class SistemaCalculadora {
	
	public Vetor3D calcularProdutoVetorial(Vetor3D vetorA, Vetor3D vetorB) {
		double x = vetorA.getY() * vetorB.getZ() - vetorA.getZ() * vetorB.getY();
		double y = vetorA.getZ() * vetorB.getX() - vetorA.getX() * vetorB.getZ();
		double z = vetorA.getX() * vetorB.getY() - vetorA.getY() * vetorB.getX();
		
		Vetor3D novoVetor = new Vetor3D(x, y, z);

		return novoVetor;
		
	}
	
	public double calcularAreaParalelograma(Vetor3D vetorA, Vetor3D vetorB) {
		Vetor3D novoVetor = calcularProdutoVetorial(vetorA, vetorB);
		return novoVetor.modulo();
		
	}
	
	public double calcularAreaTriangulo(Vetor3D vetorA, Vetor3D vetorB) {
		Vetor3D novoVetor = calcularProdutoVetorial(vetorA, vetorB);
		return novoVetor.modulo()/2;
		
	}

	
	public double produtoEscalar(Vetor2D vetorA, Vetor2D vetorB) {
		double produto = vetorA.getX() * vetorB.getX() + vetorA.getY() * vetorB.getY();
		return produto;
	}

	public double produtoEscalar(Vetor3D vetorA, Vetor3D vetorB) {
		double produto = vetorA.getX() * vetorB.getX() + vetorA.getY() * vetorB.getY() + vetorA.getZ() * vetorB.getZ();
		return produto;
	}

	public double anguloEntreVetores(Vetor2D vetorA, Vetor2D vetorB) {
		double cosseno = produtoEscalar(vetorA, vetorB) / (vetorA.modulo() * vetorB.modulo());
		double angulo = Math.acos(cosseno);
		return angulo;
	}

	public double anguloEntreVetores(Vetor3D vetorA, Vetor3D vetorB) {
		double cosseno = produtoEscalar(vetorA, vetorB) / (vetorA.modulo() * vetorB.modulo());
		double angulo = Math.acos(cosseno);
		return angulo;
	}

	public boolean saoPerpendiculares(Vetor2D vetorA, Vetor2D vetorB) {
		return produtoEscalar(vetorA, vetorB) == 0;
	}

	public boolean saoPerpendiculares(Vetor3D vetorA, Vetor3D vetorB) {
		return produtoEscalar(vetorA, vetorB) == 0;
	}
}
