package POO.Farmacia;

import java.util.ArrayList;
import java.util.List;

public class Farmacia {
    
    private String nome;
    private List<Medicamento> medicamentos;
    
    public Farmacia(String nome) {
        this.nome = nome;
        this.medicamentos = new ArrayList<>();
    }
    
    public void cadastrarMedicamento(Medicamento m) {
        medicamentos.add(m);
    }

    public boolean jaTemMedicamento(String nome) {
        for (Medicamento m : medicamentos) {
            if (m.getNome().equalsIgnoreCase(nome.trim())) {
                return true;
            }
        }
        return false;
    }
    
    public Medicamento buscarPorNome(String nome) {
        for (Medicamento m : medicamentos) {
            if (m.getNome().equalsIgnoreCase(nome.trim())) {
                return m;
            }
        }
        return null;
    }

    public Medicamento vender(String nome, int quantidade) {

        Medicamento m = buscarPorNome(nome);

        if (m == null) {
            return null;
        }

        if (m.vender(quantidade)) {
            return m;
        }

        return null;
    }

    public String getNome() {
        return nome;
    }
    
    public void removerMedicamento(String nome) {
        for (Medicamento m : medicamentos) {
            if (m.getNome().equalsIgnoreCase(nome.trim())) {
                medicamentos.remove(m);
                return;
            }
        }
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }
}

