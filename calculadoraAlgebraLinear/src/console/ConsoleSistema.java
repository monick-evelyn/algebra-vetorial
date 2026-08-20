package console;

import controller.ControladorSistema;
import model.Vetor;
import model.Vetor2D;
import model.Vetor3D;

import java.util.Scanner;

public class ConsoleSistema {

    private Scanner scanner;
    private ControladorSistema controlador;

    public ConsoleSistema() {
        this.scanner = new Scanner(System.in);
        this.controlador = new ControladorSistema();
    }

    public void iniciar() {
        System.out.println("=== Calculadora Vetorial ===");

        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");
            processarOpcao(opcao);
        } while (opcao != 0);

        scanner.close();
    }

    private void exibirMenu() {
        System.out.println("\n--- MENU PRINCIPAL ---");
        System.out.println("[OPERAÇÕES 2D]");
        System.out.println("1.  Calcular Produto Escalar (2D)");
        System.out.println("2.  Calcular Ângulo entre Vetores (2D)");
        System.out.println("3.  Verificar se são Perpendiculares (2D)");
        System.out.println("4.  Calcular Módulo do Vetor (2D)");
        System.out.println("5.  Calcular Projeção de Vetores (2D)");
        System.out.println("\n[OPERAÇÕES 3D]");
        System.out.println("6.  Calcular Produto Escalar (3D)");
        System.out.println("7.  Calcular Produto Vetorial (3D)");
        System.out.println("8.  Calcular Ângulo entre Vetores (3D)");
        System.out.println("9.  Verificar se são Perpendiculares (3D)");
        System.out.println("10. Calcular Módulo do Vetor (3D)");
        System.out.println("11. Calcular Projeção de Vetores (3D)");
        System.out.println("12. Calcular Área de Paralelogramo (3D)");
        System.out.println("13. Calcular Área de Triângulo (3D)");
        System.out.println("0.  Sair");
    }

    private boolean processarOpcao(int opcao) {
        try {
            switch (opcao) {
                // Operações 2D
                case 1 :
                    executarProdutoEscalar2D();
                    break;
                case 2 :
                    executarAngulo2D();
                    break;
                case 3 :
                    executarPerpendiculares2D();
                    break;
                case 4 :
                    executarModulo2D();
                    break;
                case 5 :
                    executarProjecao2D();
                    break;
                // Operações 3D
                case 6 :
                    executarProdutoEscalar3D();
                    break;
                case 7 :
                    executarProdutoVetorial();
                    break;
                case 8 :
                    executarAngulo3D();
                    break;
                case 9 :
                    executarPerpendiculares3D();
                    break;
                case 10 :
                    executarModulo3D();
                    break;
                case 11 :
                    executarProjecao3D();
                    break;
                case 12 :
                    executarAreaParalelogramo();
                    break;
                case 13 :
                    executarAreaTriangulo();
                    break;
                case 0 :
                    System.out.println("Encerrando o sistema... Até logo!");
                    break;
                default :
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
        return true;
    }

    // MÉTODOS DE EXECUÇÃO 2D

    private void executarProdutoEscalar2D() {
        System.out.println("\n-- Produto Escalar 2D --");
        Vetor2D vA = lerVetor2D("A");
        Vetor2D vB = lerVetor2D("B");
        double produto = controlador.produtoEscalar(vA, vB);
        System.out.printf("Produto Escalar: %.2f\n", produto);
    }

    private void executarAngulo2D() {
        System.out.println("\n-- Ângulo entre Vetores 2D --");
        Vetor2D vA = lerVetor2D("A");
        Vetor2D vB = lerVetor2D("B");
        double angulo = controlador.anguloEntreVetores(vA, vB);
        System.out.printf("Ângulo (em radianos): %.2f\n", angulo);
    }

    private void executarPerpendiculares2D() {
        System.out.println("\n-- Verificar Perpendicularidade 2D --");
        Vetor2D vA = lerVetor2D("A");
        Vetor2D vB = lerVetor2D("B");
        boolean saoPerpendiculares = controlador.saoPerpendiculares(vA, vB);
        if (saoPerpendiculares) {
            System.out.println("Resultado: Os vetores SÃO perpendiculares (ortogonais).");
        } else {
            System.out.println("Resultado: Os vetores NÃO SÃO perpendiculares.");
        }
    }

    private void executarModulo2D() {
        System.out.println("\n-- Módulo do Vetor 2D --");
        Vetor2D vetor = lerVetor2D("Único");
        double modulo = controlador.moduloDoVetor(vetor);
        System.out.printf("Módulo (tamanho): %.2f\n", modulo);
    }

    private void executarProjecao2D() {
        System.out.println("\n-- Projeção de Vetores 2D (A sobre B) --");
        Vetor2D vA = lerVetor2D("A (que será projetado)");
        Vetor2D vB = lerVetor2D("B (base da projeção)");
        try {
            Vetor resultado = controlador.projetarVetores(vA, vB);
            Vetor2D res2D = (Vetor2D) resultado;
            System.out.printf("Vetor Projeção: Vetor2D(%.2f, %.2f)\n", res2D.getX(), res2D.getY());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    // MÉTODOS DE EXECUÇÃO 3D

    private void executarProdutoEscalar3D() {
        System.out.println("\n-- Produto Escalar 3D --");
        Vetor3D vA = lerVetor3D("A");
        Vetor3D vB = lerVetor3D("B");
        double produto = controlador.produtoEscalar(vA, vB);
        System.out.printf("Produto Escalar: %.2f\n", produto);
    }

    private void executarProdutoVetorial() {
        System.out.println("\n-- Produto Vetorial 3D --");
        Vetor3D vA = lerVetor3D("A");
        Vetor3D vB = lerVetor3D("B");
        Vetor3D resultado = controlador.calcularProdutoVetorial(vA, vB);

        if (resultado != null) {
            System.out.printf("Resultado: Vetor3D(%.2f, %.2f, %.2f)\n", resultado.getX(), resultado.getY(), resultado.getZ());
        } else {
            System.out.println("Não foi possível calcular o produto vetorial (vetores inválidos).");
        }
    }

    private void executarAngulo3D() {
        System.out.println("\n-- Ângulo entre Vetores 3D --");
        Vetor3D vA = lerVetor3D("A");
        Vetor3D vB = lerVetor3D("B");
        double angulo = controlador.anguloEntreVetores(vA, vB);
        System.out.printf("Ângulo (em radianos): %.2f\n", angulo);
    }

    private void executarPerpendiculares3D() {
        System.out.println("\n-- Verificar Perpendicularidade 3D --");
        Vetor3D vA = lerVetor3D("A");
        Vetor3D vB = lerVetor3D("B");
        boolean saoPerpendiculares = controlador.saoPerpendiculares(vA, vB);
        if (saoPerpendiculares) {
            System.out.println("Resultado: Os vetores SÃO perpendiculares (ortogonais).");
        } else {
            System.out.println("Resultado: Os vetores NÃO SÃO perpendiculares.");
        }
    }

    private void executarModulo3D() {
        System.out.println("\n-- Módulo do Vetor 3D --");
        Vetor3D vetor = lerVetor3D("Único");
        double modulo = controlador.moduloDoVetor(vetor);
        System.out.printf("Módulo (tamanho): %.2f\n", modulo);
    }

    private void executarProjecao3D() {
        System.out.println("\n-- Projeção de Vetores 3D (A sobre B) --");
        Vetor3D vA = lerVetor3D("A (que será projetado)");
        Vetor3D vB = lerVetor3D("B (base da projeção)");
        try {
            Vetor resultado = controlador.projetarVetores(vA, vB);
            Vetor3D res3D = (Vetor3D) resultado;
            System.out.printf("Vetor Projeção: Vetor3D(%.2f, %.2f, %.2f)\n", res3D.getX(), res3D.getY(), res3D.getZ());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private void executarAreaParalelogramo() {
        System.out.println("\n-- Área do Paralelogramo 3D --");
        Vetor3D vA = lerVetor3D("A");
        Vetor3D vB = lerVetor3D("B");
        double area = controlador.calcularAreaParalelogramo(vA, vB);

        if (area != -1) {
            System.out.printf("Área do Paralelogramo: %.2f\n", area);
        } else {
            System.out.println("Erro ao calcular a área. Verifique os vetores informados.");
        }
    }

    private void executarAreaTriangulo() {
        System.out.println("\n-- Área do Triângulo 3D --");
        Vetor3D vA = lerVetor3D("A");
        Vetor3D vB = lerVetor3D("B");
        double area = controlador.calcularAreaTriangulo(vA, vB);

        if (area != -1) {
            System.out.printf("Área do Triângulo: %.2f\n", area);
        } else {
            System.out.println("Erro ao calcular a área. Verifique os vetores informados.");
        }
    }

    // MÉTODOS UTILITÁRIOS (ENTRADA DE DADOS)

    private Vetor2D lerVetor2D(String nome) {
        System.out.println("Digite as coordenadas do Vetor " + nome + " (2D):");
        double x = lerDouble("X: ");
        double y = lerDouble("Y: ");
        return new Vetor2D(x, y);
    }

    private Vetor3D lerVetor3D(String nome) {
        System.out.println("Digite as coordenadas do Vetor " + nome + " (3D):");
        double x = lerDouble("X: ");
        double y = lerDouble("Y: ");
        double z = lerDouble("Z: ");
        return new Vetor3D(x, y, z);
    }

    private int lerInteiro(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine().trim();
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Por favor, digite apenas um número inteiro.");
            }
        }
    }

    private double lerDouble(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine().trim();
            try {
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número válido (ex: 2.5).");
            }
        }
    }
}