package POO.Ventilador;

public enum NivelVelocidade {
    DESLIGADO("Desligado"),
    BAIXO("Baixo"),
    MEDIO("Médio"),
    ALTO("Alto");
    
    private String nomeExibicao;
    
    NivelVelocidade(String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }
    
    @Override
    public String toString() {
        return nomeExibicao ;
    }
}
