package POO.Conta;

import java.util.Scanner;

public class ContaCorrente {

    Scanner scanner = new Scanner(System.in);

    private ClienteConta cliente;
    private double saldo = 1000;
    private boolean especial = true;
    private double limite = 2000;
    private boolean contaBloqueada = false;

    protected ContaCorrente(ClienteConta cliente) {
        this.cliente = cliente;
    }

    protected void mostrarSaldo() {
        System.out.println("Seu saldo atual é: " + saldo);
    }

    protected void realizarDeposito() {
        if (contaBloqueada) {
            System.out.println("Sua conta está bloqueada, não é possivel realizar depósito");
        } else {
            System.out.println("Informe o valor que deseja depositar: ");
            double valorDeposito = scanner.nextDouble();

            if (valorDeposito <= 0) {
                System.out.println("Não é possível depositar valores igual ou menor que 0");
            } else {
                saldo += valorDeposito;
                System.out.println("Valor depositado com sucesso");
            }
        }

    }

    protected void realizarSaque() {
        if (contaBloqueada) {
            System.out.println("Sua conta está bloqueada, não é possível realizar saque");
        } else {
            System.out.println("Informe o valor que você deseja sacar:");
            double saque = scanner.nextDouble();

            double novoSaldo = saldo - saque;

            if (especial) {
                if (novoSaldo >= -limite) {
                    saldo = novoSaldo;
                    System.out.println("Saque realizado com sucesso");
                } else {
                    System.out.println("Saque inválido, valor ultrapassa o limite da conta");
                }
            } else {
                if (novoSaldo >= 0) {
                    saldo = novoSaldo;
                    System.out.println("Saque realizado com sucesso");
                } else {
                    System.out.println("Saque inválido, saldo insuficiente");
                }
            }
        }

    }

    protected void verificarCheque() {
        if (contaBloqueada) {
            System.out.println("Sua conta está bloqueada, não é possível verificar o cheque especial");
        } else {
            if (especial) {
                if (saldo >= 0) {
                    System.out.println("A conta não está usando cheque especial");
                } else {
                    System.out.println("A conta está usando cheque especial");
                }
            } else {
                System.out.println("A conta não possue acesso ao cheque especial");
            }
        }
    }

    protected void mostrarInformacoesConta() {
        if (contaBloqueada) {
            System.out.println("Sua conta esta bloqueada.");
        } else {
            System.out.println("Informações da conta:");
            System.out.println("Saldo atual da conta: " + saldo);
            if (especial) {
                System.out.println("Status: conta especial");
                System.out.println("Limite cheque especial: " + limite);
            } else {
                System.out.println("Status: conta não é especial");
            }
        }

    }

    protected void autenticarAcessoMenu() {
        if (contaBloqueada) {
            System.out.println("Sua conta está bloqueada");
        } else {
            int tentativasAcessoMenu = 3;

            while (tentativasAcessoMenu > 0) {
                System.out.println("Informe seu CPF: ");
                String tentativaCpf = scanner.nextLine();

                System.out.println("Digite a sua senha: ");
                String tentativaSenha = scanner.nextLine();

                if (tentativaCpf.equals(cliente.getCpf()) && tentativaSenha.equals(cliente.getSenha())) {
                    System.out.println("Acesso ao menu liberado.");
                    mostrarMenu();
                    break;
                } else {
                    tentativasAcessoMenu--;
                    if (tentativasAcessoMenu != 0) {
                        System.out.println("Acesso negado, restam " + tentativasAcessoMenu + " tentativas");
                    } else {
                        System.out.println("Tentativas esgotadas, acesso bloqueado");
                        contaBloqueada = true;
                    }

                }
            }
        }


    }

    private void mostrarMenu() {
        int opMenu = 0;

        do {
            System.out.println("--MENU--");
            System.out.println("0 - Sair do sistema");
            System.out.println("1 - Mostrar saldo");
            System.out.println("2 - Realizar depósito");
            System.out.println("3 - Realizar saque");
            System.out.println("4 - verificar uso do cheque especial");
            System.out.println("5 - Mostrar informações da conta");

            opMenu = scanner.nextInt();
            scanner.nextLine();

            switch (opMenu) {
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                case 1:
                    mostrarSaldo();
                    break;

                case 2:
                    realizarDeposito();
                    break;

                case 3:
                    realizarSaque();
                    break;

                case 4:
                    verificarCheque();
                    break;

                case 5:
                    mostrarInformacoesConta();
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opMenu != 0);

    }


    public ClienteConta getCliente() {
        return cliente;
    }
}


