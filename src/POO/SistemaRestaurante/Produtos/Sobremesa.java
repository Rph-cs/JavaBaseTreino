package POO.SistemaRestaurante.Produtos;

public class Sobremesa extends Produto {
    private TemperaturaSobremesa temperaturaSobremesa;

    public Sobremesa(String nome, double preco, StatusProduto statusProduto, TemperaturaSobremesa temperaturaSobremesa) {
        super(nome, preco, statusProduto);
        
        this.temperaturaSobremesa = temperaturaSobremesa;
    }
}
