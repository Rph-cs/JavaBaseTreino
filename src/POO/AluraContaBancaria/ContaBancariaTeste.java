package POO.AluraContaBancaria;

import java.util.Scanner;

public class ContaBancariaTeste {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = scanner.next();
        
        ContaBancaria cliente = new ContaBancaria(nome);
      
        int op = 0;

        System.out.println("\nSeja bem vindo " + cliente.getNome());
        
        while (op != 4) {

            abrirMenu();
            
            op = lerInteiro(scanner, "\nInforme a opção desejada: ");
            
            switch (op) {
                
                case 1 -> System.out.printf("\nSaldo atual: %.2f%n", cliente.getSaldo());
                
                case 2 -> {
                    double valor = lerDouble(scanner, "\nInforme o valor a receber: ");
                    cliente.receberValor(valor);
                }
                
                case 3 -> {
                    double valor = lerDouble(scanner, "\nInforme o valor a ser transferido: ");
                    cliente.transferirValor(valor);
                }
                
                case 4 -> System.out.println("Sistema encerrado.");

                default -> System.out.println("Opção inválida");
            }
                
                
        }
        
    }

    public static void abrirMenu() {
        System.out.println("\n--MENU DE OPERAÇÕES--");
        System.out.println("1 - Consultar saldos");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");
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

    private static double lerDouble(Scanner scanner, String mensagem) {

        while (true) {
            System.out.print(mensagem);
            if (scanner.hasNextDouble()) {
                double valor = scanner.nextDouble();
                scanner.nextLine();
                return valor;
            }
            System.out.println("Digite apenas números.");
            scanner.nextLine();
        }
    }
}
