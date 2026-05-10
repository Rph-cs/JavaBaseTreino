package POO.SistemaRestaurante.Produtos;

public enum TamanhoBebida {
    PEQUENA("Pequena"),
    MEDIA("Média"),
    GRANDE("Grande");
    
    private final String nomeExibicao;
    
    TamanhoBebida(String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }

    @Override
    public String toString() {
        return nomeExibicao;
    }
}
