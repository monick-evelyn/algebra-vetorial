package sistema;

public class SistemaCalculadora {

	
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
