package controller;

import model.Vetor;
import model.Vetor2D;
import model.Vetor3D;
import sistema.SistemaCalculadora;

public class ControladorSistema {

    SistemaCalculadora sistema;

    public ControladorSistema() {
        sistema = new SistemaCalculadora();
    }
    
// 2D

    public double produtoEscalar(Vetor2D vetorA, Vetor2D vetorB) {
        return sistema.produtoEscalar(vetorA, vetorB);
    }

    public double anguloEntreVetores(Vetor2D vetorA, Vetor2D vetorB) {
        return sistema.anguloEntreVetores(vetorA, vetorB);
    }

    public boolean saoPerpendiculares(Vetor2D vetorA, Vetor2D vetorB) {
        return sistema.saoPerpendiculares(vetorA, vetorB);
    }
    
    public double moduloDoVetor(Vetor2D vetor) {
    	return sistema.moduloDoVetor(vetor);
    }
    
    public Vetor projetarVetores(Vetor2D vetorA, Vetor2D vetorB) {
    	return sistema.projetarVetores(vetorA, vetorB);
    }
    
 // 3D

    public double produtoEscalar(Vetor3D vetorA, Vetor3D vetorB) {
        return sistema.produtoEscalar(vetorA, vetorB);
    }

    public double anguloEntreVetores(Vetor3D vetorA, Vetor3D vetorB) {
        return sistema.anguloEntreVetores(vetorA, vetorB);
    }

    public boolean saoPerpendiculares(Vetor3D vetorA, Vetor3D vetorB) {
        return sistema.saoPerpendiculares(vetorA, vetorB);
    }
    
    public double moduloDoVetor(Vetor3D vetor) {
    	return sistema.moduloDoVetor(vetor);
    }
    
    public Vetor projetarVetores(Vetor3D vetorA, Vetor3D vetorB) {
    	return sistema.projetarVetores(vetorA, vetorB);
    }

	public double calcularAreaTriangulo(Vetor3D vetorA, Vetor3D vetorB) {
		return sistema.calcularAreaTriangulo(vetorA, vetorB);
	}

	public Vetor3D calcularProdutoVetorial(Vetor3D vetorA, Vetor3D vetorB) {
		return sistema.calcularProdutoVetorial(vetorA, vetorB);
	}

	public double calcularAreaParalelogramo(Vetor3D vetorA, Vetor3D vetorB) {
		return sistema.calcularAreaParalelogramo(vetorA, vetorB);
	}
}
