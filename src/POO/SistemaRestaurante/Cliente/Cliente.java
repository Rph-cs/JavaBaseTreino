package POO.SistemaRestaurante.Cliente;

public class Cliente {
    private String nome;
    private String cpf;
    
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public boolean verificarDigitosCpf(String cpf) {
        return cpf != null && cpf.trim().length() == 11;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}
