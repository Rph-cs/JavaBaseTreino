package POO.SistemaRestaurante.Produtos;

public class Bebidas extends Produto {
    private TamanhoBebida tamanhoBebida;
    
    public Bebidas(String nome, double preco, TamanhoBebida tamanhoBebida) {
        super(nome, preco);
        
        this.tamanhoBebida = tamanhoBebida;
    }

    @Override
    public int getTempoPreparo() {
        return 15;
    }
    
}
