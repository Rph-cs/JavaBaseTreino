package POO.SistemaRestaurante.Pedido;

public enum StatusPedido {
    ABERTO("Aberto"),
    FECHADO("Fechado");
    
    private final String nomeExibicao;

    StatusPedido(String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }

    @Override
    public String toString() {
        return nomeExibicao;
    }
}
