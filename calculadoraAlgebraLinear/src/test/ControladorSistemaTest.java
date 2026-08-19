package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import controller.ControladorSistema;
import model.Vetor2D;
import model.Vetor3D;

public class ControladorSistemaTest {

    private ControladorSistema controlador;
    private double DELTA = 0.000001;
	
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
        assertEquals(resultadoEsperado, resultadoObtido, DELTA);
    }

    @Test
    public void testProdutoEscalar3D() {
        Vetor3D vetorA = new Vetor3D(1, 2, 3);
        Vetor3D vetorB = new Vetor3D(4, 5, 6);
        double resultadoEsperado = 32.0;
        double resultadoObtido = controlador.produtoEscalar(vetorA, vetorB);
        assertEquals(resultadoEsperado, resultadoObtido, DELTA);
    }

    @Test
    public void testAnguloEntreVetores2D() {
        Vetor2D vetorA = new Vetor2D(1, 0);
        Vetor2D vetorB = new Vetor2D(0, 1);
        double resultadoEsperado = Math.PI / 2; 
        double resultadoObtido = controlador.anguloEntreVetores(vetorA, vetorB);
        assertEquals(resultadoEsperado, resultadoObtido, DELTA);
    }

    @Test
    public void testAnguloEntreVetores3D() {
        Vetor3D vetorA = new Vetor3D(1, 0, 0);
        Vetor3D vetorB = new Vetor3D(0, 1, 0);
        double resultadoEsperado = Math.PI / 2; 
        double resultadoObtido = controlador.anguloEntreVetores(vetorA, vetorB);
        assertEquals(resultadoEsperado, resultadoObtido, DELTA);
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
}
