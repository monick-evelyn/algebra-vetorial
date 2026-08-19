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

    @Test
    public void testCalcularProdutoVetorial() {
        Vetor3D vetorA = new Vetor3D(1, 0, 0);
        Vetor3D vetorB = new Vetor3D(0, 1, 0);
        Vetor3D resultadoObtido = controlador.calcularProdutoVetorial(vetorA, vetorB);
        
        assertEquals(0.0, resultadoObtido.getX(), DELTA);
        assertEquals(0.0, resultadoObtido.getY(), DELTA);
        assertEquals(1.0, resultadoObtido.getZ(), DELTA);
    }

    @Test
    public void testCalcularAreaParalelograma() {
        Vetor3D vetorA = new Vetor3D(3, 0, 0);
        Vetor3D vetorB = new Vetor3D(0, 4, 0);
        double resultadoEsperado = 12.0;
        double resultadoObtido = controlador.calcularAreaParalelogramo(vetorA, vetorB);
        assertEquals(resultadoEsperado, resultadoObtido, DELTA);
    }

    @Test
    public void testCalcularAreaTriangulo() {
        Vetor3D vetorA = new Vetor3D(3, 0, 0);
        Vetor3D vetorB = new Vetor3D(0, 4, 0);
        double resultadoEsperado = 6.0;
        double resultadoObtido = controlador.calcularAreaTriangulo(vetorA, vetorB);
        assertEquals(resultadoEsperado, resultadoObtido, DELTA);
    }

    @Test
    public void testModuloDoVetor2D() {
        Vetor2D vetor = new Vetor2D(3, 4);
        double resultadoEsperado = 5.0;
        double resultadoObtido = controlador.moduloDoVetor(vetor);
        assertEquals(resultadoEsperado, resultadoObtido, DELTA);
    }

    @Test
    public void testModuloDoVetor3D() {
        Vetor3D vetor = new Vetor3D(2, 3, 6);
        double resultadoEsperado = 7.0;
        double resultadoObtido = controlador.moduloDoVetor(vetor);
        assertEquals(resultadoEsperado, resultadoObtido, DELTA);
    }

    @Test
    public void testProjetarVetores2D() {
        Vetor2D vetorA = new Vetor2D(3, 4);
        Vetor2D vetorB = new Vetor2D(1, 0);
        Vetor2D resultadoObtido = (Vetor2D) controlador.projetarVetores(vetorA, vetorB);
        
        assertEquals(3.0, resultadoObtido.getX(), DELTA);
        assertEquals(0.0, resultadoObtido.getY(), DELTA);
    }

    @Test
    public void testProjetarVetores3D() {
        Vetor3D vetorA = new Vetor3D(3, 4, 2);
        Vetor3D vetorB = new Vetor3D(1, 2, 0);
        Vetor3D resultadoObtido = (Vetor3D) controlador.projetarVetores(vetorA, vetorB);
        
        assertEquals(2.2, resultadoObtido.getX(), DELTA);
        assertEquals(4.4, resultadoObtido.getY(), DELTA);
        assertEquals(0.0, resultadoObtido.getZ(), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProjetarVetores2DVetorBaseNulo() {
        Vetor2D vetorA = new Vetor2D(3, 4);
        Vetor2D vetorB = new Vetor2D(0, 0);
        controlador.projetarVetores(vetorA, vetorB);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProjetarVetores3DVetorBaseNulo() {
        Vetor3D vetorA = new Vetor3D(3, 4, 2);
        Vetor3D vetorB = new Vetor3D(0, 0, 0);
        controlador.projetarVetores(vetorA, vetorB);
    }
}