package POO.SistemaRestaurante.Produtos;

public class Lanche extends Produto {

    private String ingrediente;
    
    public Lanche(String nome, double preco, String ingrediente) {
        super(nome, preco);
        
        this.ingrediente = ingrediente;
    }

    @Override
    public int getTempoPreparo() {
        return 15;
    }
}
