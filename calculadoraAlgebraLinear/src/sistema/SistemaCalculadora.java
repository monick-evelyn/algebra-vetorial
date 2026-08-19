package sistema;

import model.Vetor;
import model.Vetor2D;
import model.Vetor3D;

public class SistemaCalculadora {
	
	public Vetor3D calcularProdutoVetorial(Vetor3D vetorA, Vetor3D vetorB) throws IllegalArgumentException {
		
		double x = vetorA.getY() * vetorB.getZ() - vetorA.getZ() * vetorB.getY();
		double y = vetorA.getZ() * vetorB.getX() - vetorA.getX() * vetorB.getZ();
		double z = vetorA.getX() * vetorB.getY() - vetorA.getY() * vetorB.getX();
		
		Vetor3D novoVetor = new Vetor3D(x, y, z);
		
		return novoVetor;
		
	}
	
	public double calcularAreaParalelograma(Vetor3D vetorA, Vetor3D vetorB) throws IllegalArgumentException {
		
		Vetor3D novoVetor = calcularProdutoVetorial(vetorA, vetorB);
		
		return novoVetor.modulo();
		
	}
	
	public double calcularAreaTriangulo(Vetor3D vetorA, Vetor3D vetorB) throws IllegalArgumentException {
		
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
	
	public double moduloDoVetor(Vetor2D vetor) {
		return vetor.modulo();
	}
	
	public double moduloDoVetor(Vetor3D vetor) {
		return vetor.modulo();
	}
	
	public Vetor projetarVetores(Vetor2D vetorA, Vetor2D vetorB) {
		double produtoEscalar = produtoEscalar(vetorA, vetorB);
		double norma = produtoEscalar(vetorB, vetorB);
		
		if (norma == 0) throw new IllegalArgumentException("O vetor base não pode ser nulo.");
		double fator = produtoEscalar/norma;
		
		return multiplicarPeloFator(fator, vetorB);
	}
	
	public Vetor projetarVetores(Vetor3D vetorA, Vetor3D vetorB) {
		double produtoEscalar = produtoEscalar(vetorA, vetorB);
		double norma = produtoEscalar(vetorB, vetorB);
		
		if (norma == 0) throw new IllegalArgumentException("O vetor base não pode ser nulo.");
		double fator = produtoEscalar/norma;
		
		return multiplicarPeloFator(fator, vetorB);
	}
	
	private Vetor2D multiplicarPeloFator(double fator, Vetor2D vetorB) {
		double x = vetorB.getX() * fator;
		double y = vetorB.getY() * fator;
		return new Vetor2D(x, y);
	}
	
	private Vetor3D multiplicarPeloFator(double fator, Vetor3D vetorB) {
		double x = vetorB.getX() * fator;
		double y = vetorB.getY() * fator;
		double z = vetorB.getZ() * fator;
		return new Vetor3D(x, y, z);
	}
	
}
