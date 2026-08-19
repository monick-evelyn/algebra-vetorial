package controller;

import sistema.SistemaCalculadora;
import model.*;

public class ControladorSistema {

    SistemaCalculadora sistema;

    public ControladorSistema() {
        sistema = new SistemaCalculadora();
    }

    public Vetor3D calcularProdutoVetorial(Vetor3D vetorA, Vetor3D vetorB) {
    	return sistema.calcularProdutoVetorial(vetorA, vetorB);
    }
    
    public  double calcularAreaParalelograma(Vetor3D vetorA, Vetor3D vetorB) {
    	return sistema.calcularAreaParalelograma(vetorA, vetorB);
    }
    
    public double  calcularAreaTriangulo(Vetor3D vetorA, Vetor3D vetorB) {
    	return sistema.calcularAreaTriangulo(vetorA, vetorB);
    }

    public double produtoEscalar(Vetor2D vetorA, Vetor2D vetorB) {
        return sistema.produtoEscalar(vetorA, vetorB);
    }

    public double anguloEntreVetores(Vetor2D vetorA, Vetor2D vetorB) {
        return sistema.anguloEntreVetores(vetorA, vetorB);
    }

    public boolean saoPerpendiculares(Vetor2D vetorA, Vetor2D vetorB) {
        return sistema.saoPerpendiculares(vetorA, vetorB);
    }

    public double produtoEscalar(Vetor3D vetorA, Vetor3D vetorB) {
        return sistema.produtoEscalar(vetorA, vetorB);
    }

    public double anguloEntreVetores(Vetor3D vetorA, Vetor3D vetorB) {
        return sistema.anguloEntreVetores(vetorA, vetorB);
    }

    public boolean saoPerpendiculares(Vetor3D vetorA, Vetor3D vetorB) {
        return sistema.saoPerpendiculares(vetorA, vetorB);
    }
}
