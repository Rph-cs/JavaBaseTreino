package POO.SistemaRestaurante.Produtos;

public class Sobremesa extends Produto {
    private TemperaturaSobremesa temperaturaSobremesa;

    public Sobremesa(String nome, double preco, int tempoPreparo, TemperaturaSobremesa temperaturaSobremesa) {
        super(nome, preco, tempoPreparo);
 
        this.temperaturaSobremesa = temperaturaSobremesa;
    }
}
