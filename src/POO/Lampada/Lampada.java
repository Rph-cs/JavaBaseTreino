package POO.Lampada;

public class Lampada {
    
    private String nome;
    private String marca;
    private boolean estaLigada = false;
    
    public Lampada(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
    }
    
    protected void ligarLampada() {
        if (estaLigada) {
            System.out.println("A lâmpada já esta ligada ");
        } else {
            System.out.println("A lâmpada foi ligada");
            estaLigada = true;
        }
    }
    
    protected void desligarLampada() {
        if (estaLigada) {
            System.out.println("A lâmpada foi desligada");
        } else {
            System.out.println("A lâmpada ja esta desligada");
            estaLigada = false;
        }
    }
    
}
