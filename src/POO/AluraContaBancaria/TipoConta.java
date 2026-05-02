package POO.AluraContaBancaria;

public enum TipoConta {
    CORRENTE("Conta corrente");
    
    private String nomeExibicao;
    
    TipoConta(String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }
    
    @Override
    public String toString() {
        return nomeExibicao;
    }
}
