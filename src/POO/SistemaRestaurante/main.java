package POO.SistemaRestaurante;

import POO.SistemaRestaurante.Cliente.Cliente;
import POO.SistemaRestaurante.Produtos.*;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Restaurante restaurante = new Restaurante();
        
        int op = 0;
        
        while(op != 8) {
            
            abrirMenu(scanner);
            op = lerInteiro(scanner, "\nInforme a opção desejada: ");
            
            
            switch (op) {
                
                case 1 -> {
                    cadastrarCliente(scanner, restaurante);
                }
                
                case 2 -> {
                    cadastrarProdutoCardapio(scanner, restaurante);
                }
                
                case 3 -> {
                    abrirPedido(scanner, restaurante);
                }
                
                case 8 -> {
                    System.out.println("Encerrando o sistema...");
                }
                
            }
        }
        
    } 
    
    private static void abrirMenu(Scanner scanner) {
        System.out.println("\n==============\n");
        System.out.println("Restaurante ");
        System.out.println("\n==============\n");
        System.out.println("--MENU--");
        System.out.println("1 - Cadastrar cliente");
        System.out.println("2 - Cadastrar produto no cardápio");
        System.out.println("3 - Abrir pedido para um cliente");
        System.out.println("4 - Adicionar produto ao pedido");
        System.out.println("5 - Ver pedido");
        System.out.println("6 - Fechar pedido e exibir total e tempo estimado");
        System.out.println("7 - Ver relatório do restaurante");
        System.out.println("8 - Sair");
        
        
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
    
    private static void cadastrarCliente(Scanner scanner, Restaurante restaurante) {
        System.out.print("\nInforme seu nome para o cadastro: ");
        String nome = scanner.nextLine();

        System.out.print("\nInforme seu cpf para o cadastro: ");
        String cpf = scanner.nextLine();
        
        Cliente cliente = new Cliente(nome, cpf);
        
        if (!cliente.verificarDigitosCpf(cpf)) {
            System.out.println("\nCPF informado é inválido");
            return;
        }
        
        if (restaurante.cpfJaExiste(cpf)) {
            System.out.println("\nO cpf informado já está cadastrado");
            return;
        }
        restaurante.cadastrarCliente(cliente);
        System.out.println("\nCliente cadastrado com sucesso!");
        
    }
    
    private static void cadastrarProdutoCardapio(Scanner scanner, Restaurante restaurante) {
        
        System.out.println("Qual tipo de produto deseja cadastrar?");
        System.out.println("1 - Lanche");
        System.out.println("2 - Bebida");
        System.out.println("3 - Sobremesa");

        int op = lerInteiro(scanner, "Escolha a opção desejada: ");
        switch (op) {
            
            case 1 -> {
                System.out.print("Informe o nome do lanche: ");
                String nome = scanner.nextLine();

                System.out.print("Informe o preço do lanche: ");
                double preco = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Informe o tempo de preparo do lanche: ");
                int tempoPreparo = scanner.nextInt();
                
                Produto lanche = new Lanche(nome, preco, tempoPreparo);
                
                restaurante.cadastrarProduto(lanche);
            }
            
            case 2 -> {
                System.out.print("Informe o nome da bebida: ");
                String nome = scanner.nextLine();

                System.out.print("Informe o preço da bebida: ");
                double preco = lerDouble(scanner, "");

                System.out.println("Informe o tempo de preparo da bebida: ");
                int tempoPreparo = lerInteiro(scanner, "");

                System.out.println("Informe o tamanho da bebida(grande, media, pequena)");
                String tamanho = scanner.nextLine().toUpperCase();
                
                TamanhoBebida TipoEnum = TamanhoBebida.valueOf(tamanho);
                        
                Produto bebida = new Bebidas(nome, preco, tempoPreparo, TipoEnum);
                
                restaurante.cadastrarProduto(bebida);
            }
            
            case 3 -> {
                System.out.print("Informe o nome da sobremesa: ");
                String nome = scanner.nextLine();

                System.out.print("Informe o preço da sobremesa: ");
                double preco = lerDouble(scanner, "");

                System.out.println("Informe o tempo de preparo da sobremesa: ");
                int tempoPreparo = lerInteiro(scanner, "");

                System.out.println("Informe o tamanho da sobremesa(quente ou fria)");
                String tamanho = scanner.nextLine().toUpperCase();

                TemperaturaSobremesa TipoEnum = TemperaturaSobremesa.valueOf(tamanho);

                Produto sobremesa = new Sobremesa(nome, preco, tempoPreparo, TipoEnum);

                restaurante.cadastrarProduto(sobremesa);
            }
            
            default -> {
                System.out.println("Opção escolhida é inválida");
            }
            
        }
    }
    
    private static void abrirPedido(Scanner scanner, Restaurante restaurante) {
        System.out.println("Informe o seu cpf para confirmar e criar o pedido");
        String cpf = scanner.nextLine();
        
        if (restaurante.buscarCliente(cpf) == null) {
            System.out.println("Cliente não encontrado em nossos registros");
            return;
        }
        
        Cliente cliente = restaurante.buscarCliente(cpf);
        
        System.out.println("ABrindo comanda para o cliente: " + cliente.getNome());
    }
    
    
    
}
