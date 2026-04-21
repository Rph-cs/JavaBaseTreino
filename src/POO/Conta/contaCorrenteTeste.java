package POO.Conta;

import java.util.ArrayList;
import java.util.Scanner;

public class contaCorrenteTeste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<ClienteConta> clientes = new ArrayList<>();
        ArrayList<ContaCorrente> contas = new ArrayList<>();

        int op;

        do {
            System.out.println("1- Cadastrar conta");
            System.out.println("2 - Acessar conta por cpf");
            System.out.println("Finalizar");

            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {

                case 1:
                    ClienteConta novoCliente = new ClienteConta();
                    clientes.add(novoCliente);

                    ContaCorrente novaConta = new ContaCorrente(novoCliente);
                    contas.add(novaConta);

                    System.out.println("Cliente e conta cadastrados com sucesso!");
                    break;
                    
                case 2:
                    System.out.println("Digite o CPF para acessar:");
                    String cpfBusca = scanner.nextLine();

                    for (ContaCorrente conta : contas) {
                        if (conta.getCliente().getCpf().equals(cpfBusca)) {
                            conta.autenticarAcessoMenu();
                        }
                    }
                    break;
            }

        } while (op != 0);
    }
}
