package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import controller.ControladorSistema;
import model.*;

public class ControladorSistemaTest {

    private ControladorSistema controlador;
	
	@Before
	public void inicializarControlador() {
		controlador = new ControladorSistema();
	}

    @Test
    public void testProdutoEscalar2D() {
        Vetor2D vetorA = new Vetor2D(2, 3);
        Vetor2D vetorB = new Vetor2D(4, 5);
        double resultadoEsperado = 23.0;
        double resultadoObtido = controlador.produtoEscalar(vetorA, vetorB);
        assertEquals(resultadoEsperado, resultadoObtido,0.0001);
    }

    @Test
    public void testProdutoEscalar3D() {
        Vetor3D vetorA = new Vetor3D(1, 2, 3);
        Vetor3D vetorB = new Vetor3D(4, 5, 6);
        double resultadoEsperado = 32.0;
        double resultadoObtido = controlador.produtoEscalar(vetorA, vetorB);
        assertEquals(resultadoEsperado, resultadoObtido,0.0001);
    }

    @Test
    public void testAnguloEntreVetores2D() {
        Vetor2D vetorA = new Vetor2D(1, 0);
        Vetor2D vetorB = new Vetor2D(0, 1);
        double resultadoEsperado = Math.PI / 2; 
        double resultadoObtido = controlador.anguloEntreVetores(vetorA, vetorB);
        assertEquals(resultadoEsperado, resultadoObtido,0.0001);
    }

    @Test
    public void testAnguloEntreVetores3D() {
        Vetor3D vetorA = new Vetor3D(1, 0, 0);
        Vetor3D vetorB = new Vetor3D(0, 1, 0);
        double resultadoEsperado = Math.PI / 2; 
        double resultadoObtido = controlador.anguloEntreVetores(vetorA, vetorB);
        assertEquals(resultadoEsperado, resultadoObtido,0.0001);
    }

    @Test
    public void testSaoPerpendiculares2D() {
        Vetor2D vetorA = new Vetor2D(1, 0);
        Vetor2D vetorB = new Vetor2D(0, 1);
        boolean resultadoObtido = controlador.saoPerpendiculares(vetorA, vetorB);
        assertTrue(resultadoObtido);
    }

    @Test
    public void testSaoPerpendiculares3D() {
        Vetor3D vetorA = new Vetor3D(1, 0, 0);
        Vetor3D vetorB = new Vetor3D(0, 1, 0);
        boolean resultadoObtido = controlador.saoPerpendiculares(vetorA, vetorB);
        assertTrue(resultadoObtido);
    }
    
    @Test
    public void testCalcularProdutoEscalar() {
        Vetor3D vetorA = new Vetor3D(1, 2, 3);
        Vetor3D vetorB = new Vetor3D(4, 5, 6);
        
        Vetor3D vetorResultante = controlador.calcularProdutoVetorial(vetorA, vetorB);
        
        String resultado = vetorResultante.toString();
        String esperado = "Vetor3D [-3.0, 6.0, -3.0]";
        
        assertEquals(esperado,resultado);
    }
    
    @Test
    public void testCalcularAreaParalelograma() {
        Vetor3D vetorA = new Vetor3D(1, 2, 3);
        Vetor3D vetorB = new Vetor3D(4, 5, 6);
        
        double resultado = controlador.calcularAreaParalelograma(vetorA, vetorB);
        resultado = Math.round(resultado);
        
        assertEquals(7,resultado,0.0001);
    }
    
    @Test
    public void testCalcularAreaTriangulo() {
        Vetor3D vetorA = new Vetor3D(1, 2, 3);
        Vetor3D vetorB = new Vetor3D(4, 5, 6);
        
        double resultado = controlador.calcularAreaTriangulo(vetorA, vetorB);
        resultado = Math.round(resultado);
        
        assertEquals(4,resultado,0.0001);
    }
}
