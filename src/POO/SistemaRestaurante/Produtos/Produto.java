package POO.SistemaRestaurante.Produtos;

public abstract class Produto {

    private String nome;
    private double preco;
    private StatusProduto statusProduto;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;

        this.statusProduto = StatusProduto.DISPONIVEL;
    }

    public boolean isDisponivel() {
        return statusProduto == StatusProduto.DISPONIVEL;
    }

    public abstract int getTempoPreparo();

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return """
            \nNome do produto: %s
            Preço do produto: R$ %.2f
            Tempo de preparo: %d minutos
            Status do produto: %s\n
            """.formatted(nome, preco, getTempoPreparo(), statusProduto);
    }
}
