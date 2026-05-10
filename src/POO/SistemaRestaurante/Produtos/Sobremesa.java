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


    // no Lanche
    @Override
    public String toString() {
        return super.toString() + "Temperatura da sobremesa: " + temperaturaSobremesa+ "\n";
    }
}
