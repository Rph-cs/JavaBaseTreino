package POO.SistemaRestaurante;

import POO.SistemaRestaurante.Cliente.Cliente;
import POO.SistemaRestaurante.Pedido.Pedido;
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
                
                case 1 -> cadastrarCliente(scanner, restaurante);
                
                
                case 2 -> cadastrarProdutoCardapio(scanner, restaurante);
                
                case 3 -> abrirPedido(scanner, restaurante);
       
                
                case 4 -> adicionarProdutoPedido(scanner, restaurante);
                
                case 5 -> mostrarPedido(scanner, restaurante);
                
                case 6 -> fecharPedido(scanner, restaurante);
                
                case 7 -> restaurante.exibirRelatorio();
                
                case 8 -> System.out.println("Encerrando o sistema...");
                
                default -> System.out.println("Opção inválida");
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
        
        if (restaurante.buscarCliente(cpf) != null) {
            System.out.println("CPF já cadastrado.");
            return;
        }
        restaurante.cadastrarCliente(cliente);
        System.out.println("\nCliente cadastrado com sucesso!");
        
    }
    
    private static void cadastrarProdutoCardapio(Scanner scanner, Restaurante restaurante) {
        
        System.out.println("\nQual tipo de produto deseja cadastrar?");
        System.out.println("1 - Lanche");
        System.out.println("2 - Bebida");
        System.out.println("3 - Sobremesa");

        int op = lerInteiro(scanner, "Escolha a opção desejada: ");
        switch (op) {
            
            case 1 -> {
                System.out.print("\nInforme o nome do lanche: ");
                String nome = scanner.nextLine();

                System.out.print("\nInforme o preço do lanche: ");
                double preco = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Informe o ingrediente do lanche: ");
                String ingrediente = scanner.nextLine();
                
                Produto lanche = new Lanche(nome, preco, ingrediente);
                
                restaurante.cadastrarProduto(lanche);

                System.out.println("\nLanche cadastrado com sucesso|");
            }
            
            case 2 -> {
                System.out.print("\nInforme o nome da bebida: ");
                String nome = scanner.nextLine();

                System.out.print("\nInforme o preço da bebida: ");
                double preco = lerDouble(scanner, "");

                System.out.println("\nInforme o tamanho da bebida(grande, media, pequena)");
                String tamanho = scanner.nextLine().toUpperCase();
                
                TamanhoBebida TipoEnum = TamanhoBebida.valueOf(tamanho);
                        
                Produto bebida = new Bebidas(nome, preco, TipoEnum);
                
                restaurante.cadastrarProduto(bebida);

                System.out.println("\nBebida cadastrado com sucesso|");
            }
            
            case 3 -> {
                System.out.print("\nInforme o nome da sobremesa: ");
                String nome = scanner.nextLine();

                System.out.print("\nInforme o preço da sobremesa: ");
                double preco = lerDouble(scanner, "");

                System.out.println("\nInforme o tamanho da sobremesa(quente ou fria)");
                String tamanho = scanner.nextLine().toUpperCase();

                TemperaturaSobremesa TipoEnum = TemperaturaSobremesa.valueOf(tamanho);

                Produto sobremesa = new Sobremesa(nome, preco, TipoEnum);

                restaurante.cadastrarProduto(sobremesa);

                System.out.println("\nSobremesa cadastrado com sucesso|");
            }
            
            default -> {
                System.out.println("\nOpção escolhida é inválida");
            }
            
        }
    }
    
    private static void abrirPedido(Scanner scanner, Restaurante restaurante) {
        System.out.println("\nInforme o seu cpf para confirmar e criar o pedido");
        String cpf = scanner.nextLine();
        
        if (restaurante.buscarCliente(cpf) == null) {
            System.out.println("\nCliente não encontrado em nossos registros");
            return;
        }
        
        Cliente cliente = restaurante.buscarCliente(cpf);
        
        Pedido pedido = new Pedido(cliente);
        
        restaurante.cadastrarPedido(pedido);
        
        System.out.println("\nPedido para o cliente " + cliente.getNome() + " foi aberto com sucesso");
    }
    
    private static void adicionarProdutoPedido(Scanner scanner, Restaurante restaurante) {
        System.out.println("\nInforme o seu cpf para acharmos seu pedido: ");
        String cpf = scanner.nextLine();
        
        if (restaurante.buscarPedido(cpf) == null) {
            System.out.println("\nSeu pedido não foi encontrado em nossos registros");
            return;
        }

        Pedido pedido = restaurante.buscarPedido(cpf);
        
        if (!restaurante.temProdutoDisponivel()) {
            System.out.println("Não há produto disponível no momento");
            return;
        }
        restaurante.listarCardapio();

        System.out.println("\nInforme o nome do produto que deseja: ");
        String nomeProduto = scanner.nextLine();
        
        if (restaurante.buscarProdutoCardapio(nomeProduto) == null) {
            System.out.println("\nProduto inválido");
            return;
        }
        Produto produto = restaurante.buscarProdutoCardapio(nomeProduto);
        
        if (!pedido.adicionarProduto(produto)) {
            System.out.println("Não é possivel adicionar um produto que está indiponível");
            return;
        }

        System.out.println("\nProduto adicionado ao pedido com sucesso!");
    }
    
    private static void mostrarPedido(Scanner scanner, Restaurante restaurante) {
        System.out.println("\nInforme o seu cpf para acharmos seu pedido: ");
        String cpf = scanner.nextLine();

        if (restaurante.buscarPedido(cpf) == null) {
            System.out.println("\nSeu pedido não foi encontrado em nossos registros");
            return;
        }
        
        Pedido pedido = restaurante.buscarPedido(cpf);
        
        pedido.exibirPedido();
    }
    
    private static void fecharPedido(Scanner scanner, Restaurante restaurante) {
        System.out.println("\nInforme o seu cpf para acharmos seu pedido: ");
        String cpf = scanner.nextLine();

        if (restaurante.buscarPedido(cpf) == null) {
            System.out.println("\nSeu pedido não foi encontrado em nossos registros");
            return;
        }

        Pedido pedido = restaurante.buscarPedido(cpf);
        
        if (!pedido.podeEncerrarPedido()) {
            System.out.println("Não é possível fechar um pedido que já está fechado");
            return;
        }
        
        pedido.exibirPedido();
        
        double valorPago = lerDouble(scanner, "Informe o total que será pago: ");
        
        if (!pedido.valorPagoSuficiente(valorPago)) {
            System.out.println("Valor inserido é insuficiente para pagar o valor total do pedido");
            return;
        } 
        
        double troco = pedido.calcularTroco(valorPago);
        
        if (troco == 0) {
            pedido.encerrarPedido();
            System.out.println("Sem troco, pedido encerrado com sucesso|");
        } else {
            System.out.printf("Seu troco: R$ %.2f%n", troco);
            pedido.encerrarPedido();
            System.out.println("Pedido encerrado com sucesso");
        }
    }
    
    
}
