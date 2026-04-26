package POO.Farmacia;

import java.util.Scanner;

public class MedicamentoTeste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Medicamento medicamento = new Medicamento("Dipirona", "Sul 1", 4.40, 40);
        
        int op = 0;

        while (op != 4) {
            
            abrirMenu();

            op = lerInteiro(scanner, "Opção: ");
            
            switch (op) {

                case 1 -> {
                    int quantidade = lerInteiro(scanner, "Quantidade a adicionar: ");
                    medicamento.adicionarEstoque(quantidade);
                }
                case 2 -> {
                    int quantidade = lerInteiro(scanner, "Quantidade a comprar: ");
                    medicamento.vender(quantidade);
                }
                case 3 -> medicamento.mostrarStatus();

                case 4 -> System.out.println("Encerrando o sistema...");

                default -> System.out.println("Opção inválida");
            }
        }

        scanner.close();
    }

    private static int lerInteiro(Scanner scanner, String mensagem) {

        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextInt()) {
                int valor = scanner.nextInt();
                scanner.nextLine();
                return valor;
            }
            System.out.println("Digite apenas números.");
            scanner.nextLine();
        }
    }
    
    private static void abrirMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1 - Adicionar estoque");
        System.out.println("2 - Vender");
        System.out.println("3 - Ver status");
        System.out.println("4 - Sair\n");
    }
    
}