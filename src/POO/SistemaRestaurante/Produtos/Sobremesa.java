package POO.SistemaRestaurante.Produtos;

public class Sobremesa extends Produto {
    private TemperaturaSobremesa temperaturaSobremesa;

    public Sobremesa(String nome, double preco, TemperaturaSobremesa temperaturaSobremesa) {
        super(nome, preco);
 
        this.temperaturaSobremesa = temperaturaSobremesa;
    }

    @Override
    public int getTempoPreparo() {
        return 10;
    }
    
    
    
}
