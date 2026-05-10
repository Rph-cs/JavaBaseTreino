package POO.SistemaRestaurante.Produtos;

public class Bebidas extends Produto {
    private TamanhoBebida tamanhoBebida;
    
    public Bebidas(String nome, double preco, TamanhoBebida tamanhoBebida) {
        super(nome, preco);
        
        this.tamanhoBebida = tamanhoBebida;
    }

    @Override
    public int getTempoPreparo() {
        return 5;
    }

    // no Lanche
    @Override
    public String toString() {
        return super.toString() + "Tamanho da bebida: " + tamanhoBebida + "\n";
    }
    
}
