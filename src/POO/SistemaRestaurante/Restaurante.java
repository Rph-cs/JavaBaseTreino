package POO.SistemaRestaurante;

import POO.SistemaRestaurante.Cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private List<Cliente> cliente;
    
    public Restaurante() {
        this.cliente = new ArrayList<>();
    }
    
    public boolean verificarCpf(String cpf) {
        for (Cliente c : cliente) {
            if (c.getCpf().equalsIgnoreCase(cpf.trim())) {
                return false;
            }
        }
        return true;
    }
    
    public void cadastrarCliente(Cliente c) {
        cliente.add(c);
    }
    
    
}
