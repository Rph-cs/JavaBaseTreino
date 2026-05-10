package POO.SistemaRestaurante.Produtos;

public class Lanche extends Produto {

    public Lanche(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public int getTempoPreparo() {
        return 15;
    }
}
