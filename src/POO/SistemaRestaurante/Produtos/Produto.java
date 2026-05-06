package POO.SistemaRestaurante.Produtos;

public abstract class Produto {
    
    private String nome;
    private double preco;
    private StatusProduto statusProduto;
    
    public Produto(String nome, double preco, StatusProduto statusProduto) {
        this.nome = nome;
        this.preco = preco;
        this.statusProduto = StatusProduto.DISPONIVEL;
    }
    
    
}
