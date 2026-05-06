package POO.SistemaRestaurante.Cliente;

public class Cliente {
    private String nome;
    private String cpf;
    
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public boolean verificarCpf(String cpf) {
        if (cpf.length() != 11) {
            return false;
        }
        return true;
    }

    public String getCpf() {
        return cpf;
    }
}
