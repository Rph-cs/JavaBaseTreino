package POO.Farmacia;

public class Medicamento {
    
    private String nome;
    private String laboratorio;
    private double preco;
    private int estoque;
    
    public Medicamento(String nome, String laboratorio, double preco, int estoque) {
        this.nome = nome;
        this.laboratorio = laboratorio;
        this.preco = preco <= 0 ? 0 : preco;
        this.estoque = estoque < 0 ? 0 : estoque;
    }
    
    public boolean adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            return false;
        }
        
        estoque += quantidade;

        return true;
        
    }

    public boolean vender(int quantidade) {

        if (quantidade <= 0) {
            return false;
        }

        if (quantidade > estoque) {
            return false;
        }

        estoque -= quantidade;
        return true;
    }

    @Override
    public String toString() {
        return "\n--Status do produto--" +
                "\nNome do produto: " + nome +
                "\nLaboratório: " + laboratorio +
                "\nPreço unidade: " +preco +
                "\nEstoque atual: " + estoque + "\n";
    }

    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public double getPreco() {
        return preco;
    }

    public String getLaboratorio() {
        return laboratorio;
    }
}
