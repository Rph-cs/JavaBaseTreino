package POO.SistemaRestaurante.Produtos;

public abstract class Produto {

    private String nome;
    private double preco;
    private int tempoPreparo;
    private StatusProduto statusProduto;

    public Produto(String nome, double preco, int tempoPreparo) {
        this.nome = nome;
        this.preco = preco;
        this.tempoPreparo = tempoPreparo;

        this.statusProduto = StatusProduto.DISPONIVEL;
    }

    public double getPreco() {
        return preco;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    @Override
    public String toString() {
        String mensagem = """
                Nome do produto: %s
                Preço do produto: R$ %.2f
                Tempo de preparo: %d minutos
                Status do produto: %s
                """.formatted(nome, preco, tempoPreparo, statusProduto);

         return mensagem;
    }
}
