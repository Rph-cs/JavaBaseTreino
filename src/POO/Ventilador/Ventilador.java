package POO.Ventilador;

public class Ventilador {
    
    private String nome;
    private String marca;
    private int velocidadeAtual;
    private NivelVelocidade nivel;
    
    public Ventilador(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
        this.velocidadeAtual = 0;
        this.nivel = NivelVelocidade.DESLIGADO;
    }
    
    public void aumentarVelocidade() {
        
        if (velocidadeAtual == 3) {
            System.out.println("Velocidade já está no máximo");
            return;
        } else {
            velocidadeAtual++;
            atualizarNivel();
            System.out.println("Velocidade: " + nivel);
        }
    }
    
    public void diminuirVelocidade() {
        if (velocidadeAtual == 0) {
            System.out.println("Ventilador já está desligado");
        } else {
            velocidadeAtual--;
            atualizarNivel();
            System.out.println("Velocidade: " + nivel);
        }
    }

    private void atualizarNivel() {
        switch (velocidadeAtual) {
            case 0 -> nivel = NivelVelocidade.DESLIGADO;
            case 1 -> nivel = NivelVelocidade.BAIXO;
            case 2 -> nivel = NivelVelocidade.MEDIO;
            case 3 -> nivel = NivelVelocidade.ALTO;
        }
    }

    public void mostrarStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Velocidade: " + velocidadeAtual + " | Nível: " + nivel);
    }
    
    
}
