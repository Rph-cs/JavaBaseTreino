package POO.SistemaRestaurante.Produtos;

public enum StatusProduto {
    DISPONIVEL("Disponível"),
    INDISPONIVEL("Indisponível");
    
    private final String nomeExibicao;
    
    StatusProduto(String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }

    @Override
    public String toString() {
        return nomeExibicao;
    }
}
