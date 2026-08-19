package sistema;
import model.*;

public class SistemaCalculadora {
	//public void validarVetorVazio(Vetor vetor)
	public static Vetor3D calcularProdutoVetorial(Vetor3D vetorA, Vetor3D vetorB) throws IllegalArgumentException{
		
		double x = vetorA.getY() * vetorB.getZ() - vetorA.getZ() * vetorB.getY();
		double y = vetorA.getZ() * vetorB.getX() - vetorA.getX() * vetorB.getZ();
		double z = vetorA.getX() * vetorB.getY() - vetorA.getY() * vetorB.getX();
		
		Vetor3D novoVetor = new Vetor3D(x,y,z);
		
		return novoVetor;
		
	}
	
	public static void main(String[] args) {
		Vetor3D vetorA = new Vetor3D(1,2,3);
		Vetor3D vetorB = new Vetor3D(4,5,6);
		
		Vetor3D novoVetor = calcularProdutoVetorial(vetorA, vetorB);
		
		System.out.println(novoVetor.toString());
	}
}
