package POO.SistemaRestaurante.Produtos;

public enum TamanhoBebida {
    PEQUENO("Pequeno"),
    MEDIO("Médio"),
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
