package POO.Farmacia;

public class Medicamento {
    
    private String nome;
    private String laboratorio;
    private double preco;
    private int estoque;
    
    public Medicamento(String nome, String laboratorio, double preco, int estoque) {
        this.nome = nome;
        this.laboratorio = laboratorio;
        this.preco = preco <= 0 ? 0 : preco;
        this.estoque = estoque < 0 ? 0 : estoque;
    }
    
    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Valor inválido");
            return;
        }
        
        estoque += quantidade;

        System.out.println("Estoque atual: " + estoque);
        
    }
    
    public void vender(int quantidade) {
        if (quantidade > estoque) {
            System.out.println("Não temos quantidade suficiente no estoque");
            return;
        }
        mostrarConta(quantidade);
        estoque -= quantidade;

        System.out.println("Estoque atual: " + estoque);
        
    }
    
    public void mostrarStatus() {
        System.out.println("\n--Status do produto--");
        System.out.println("Nome do produto: " + nome);
        System.out.println("Laboratório: " + laboratorio);
        System.out.println("Preço unidade: " +preco);
        System.out.println("Estoque atual: " + estoque);
    }
    
    public void mostrarConta(int quantidade) {
        System.out.println("\nNome do produto: " + nome);
        System.out.println("Laboratório: " + laboratorio);
        System.out.println("Preço unidade: " +preco);
        System.out.printf("Total a pagar: R$ %.2f\n", quantidade * preco);
    }
    
    
}
