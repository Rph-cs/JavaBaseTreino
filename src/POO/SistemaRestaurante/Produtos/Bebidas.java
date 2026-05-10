package POO.SistemaRestaurante.Produtos;

public class Bebidas extends Produto {
    private TamanhoBebida tamanhoBebida;
    
    public Bebidas(String nome, double preco, int tempoPreparo, TamanhoBebida tamanhoBebida) {
        super(nome, preco, tempoPreparo);
        
        this.tamanhoBebida = tamanhoBebida;
    }
}
