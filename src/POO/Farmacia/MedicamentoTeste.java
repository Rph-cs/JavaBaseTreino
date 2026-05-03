package POO.Farmacia;

import java.util.Scanner;

public class MedicamentoTeste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Farmacia farmacia = new Farmacia("Java");

        int op = 0;

        System.out.println("Bem vindo a farmácia " + farmacia.getNome());
        
        
        while (op != 8) {

            abrirMenu();

            op = lerInteiro(scanner, "Opção: ");

            switch (op) {

                case 1 -> cadastrarMedicamento(scanner, farmacia);

                case 2 -> buscarMedicamento(scanner, farmacia);

                case 3 -> adicionarEstoque(scanner, farmacia);

                case 4 -> vender(scanner, farmacia);

                case 5 -> farmacia.listarMedicamentos();

                case 6 -> removerMedicamento(scanner, farmacia);
                
                case 7 -> farmacia.verificarEstoque();
                
                case 8 -> System.out.println("Saindo do sistema...");
                
                default -> System.out.println("Opção inválida");

            }


        }
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

    private static void abrirMenu() {
        System.out.println("\n--MENU FARMÁCIA--");
        System.out.println("1 - cadastrar medicamento");
        System.out.println("2 - buscar medicamento");
        System.out.println("3 - Adicionar estoque");
        System.out.println("4 - Vender");
        System.out.println("5 - Listar todos medicamentos");
        System.out.println("6 - Remover medicamento");
        System.out.println("7 - Mostrar medicamentos sem estoques");
        System.out.println("8 - Sair\n");
    }

    private static void cadastrarMedicamento(Scanner scanner, Farmacia farmacia) {
        System.out.print("Informe o nome do medicamento: ");
        String nome = scanner.nextLine();

        if (farmacia.buscarPorNome(nome) != null) {
            System.out.println("Este remédio ja está cadastrado");
            return;
        }

        System.out.print("Informe o laboratório do medicamento: ");
        String laboratorio = scanner.nextLine();

        double preco = lerDouble(scanner, "Informe o preço do medicamento: ");
        int estoque = lerInteiro(scanner, "Informe a quantidade de estoque do medicamento: ");

        Medicamento medicamento = new Medicamento(nome, laboratorio, preco, estoque);

        farmacia.cadastrarMedicamento(medicamento);
        System.out.println("Medicamento cadastrado com sucesso.");
    }

    private static void buscarMedicamento(Scanner scanner, Farmacia farmacia) {
        System.out.println("Informe o nome do medicamento a procura: ");
        String nome = scanner.nextLine();

        Medicamento m = farmacia.buscarPorNome(nome);

        if (m != null) {
            System.out.println(m);
        } else {
            System.out.println("Remédio não encontrado");
        }
    }

    private static void adicionarEstoque(Scanner scanner, Farmacia farmacia) {

        System.out.print("Nome do medicamento: ");
        String nome = scanner.nextLine();

        Medicamento m = farmacia.buscarPorNome(nome);

        if (m == null) {
            System.out.println("Medicamento não encontrado.");
            return;
        }

        int quantidade = lerInteiro(scanner, "Quantidade para adicionar ao estoque: ");

        if (m.adicionarEstoque(quantidade)) {
            System.out.println("Quantidade adicionada ao estoque com sucesso");
            System.out.println("Estoque atual: " + m.getEstoque());
        } else {
            System.out.println("Valor inválido");
        }
    }

    private static void vender(Scanner scanner, Farmacia farmacia) {
        System.out.print("Nome do medicamento: ");
        String nome = scanner.nextLine();

        int quantidade = lerInteiro(scanner, "Quantidade: ");

        Medicamento m = farmacia.vender(nome, quantidade);

        if (m == null) {
            System.out.println("Não foi possível realizar a venda");
            return;
        }
        
            System.out.println("\nNome do produto: " + m.getNome());
            System.out.println("Laboratório: " + m.getLaboratorio());
            System.out.printf("Preço unidade: R$ %.2f%n", m.getPreco());
            System.out.printf("Total: R$ %.2f%n", m.getPreco() * quantidade);
        
    }
    
    private static void removerMedicamento(Scanner scanner, Farmacia farmacia) {
        System.out.print("Nome do medicamento: ");
        String nome = scanner.nextLine();
        
        if (farmacia.removerMedicamento(nome)) {
            System.out.println("Medicamento removido com sucesso");
            return;
        }
        System.out.println("Medicamento não encontrado");
    }
        
}