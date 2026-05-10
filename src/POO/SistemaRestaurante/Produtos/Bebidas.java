package POO.SistemaRestaurante.Produtos;

public class Bebidas extends Produto {
    private TamanhoBebida tamanhoBebida;
    
    public Bebidas(String nome, double preco, StatusProduto statusProduto, TamanhoBebida tamanhoBebida) {
        super(nome, preco, statusProduto);
        
        this.tamanhoBebida = tamanhoBebida;
    }
}
