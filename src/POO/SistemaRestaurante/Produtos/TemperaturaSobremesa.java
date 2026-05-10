package POO.SistemaRestaurante.Produtos;

public enum TemperaturaSobremesa {
    QUENTE("Quente"),
    FRIA("Fria");
    
    private final String nomeExibicao;
    
    TemperaturaSobremesa(String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }

    @Override
    public String toString() {
        return nomeExibicao;
    }
}
