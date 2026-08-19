package sistema;
import model.*;

public class SistemaCalculadora {
	public Vetor3D calcularProdutoVetorial(Vetor3D vetorA, Vetor3D vetorB) throws IllegalArgumentException{
		
		double x = vetorA.getY() * vetorB.getZ() - vetorA.getZ() * vetorB.getY();
		double y = vetorA.getZ() * vetorB.getX() - vetorA.getX() * vetorB.getZ();
		double z = vetorA.getX() * vetorB.getY() - vetorA.getY() * vetorB.getX();
		
		Vetor3D novoVetor = new Vetor3D(x,y,z);
		
		return novoVetor;
		
	}
}
