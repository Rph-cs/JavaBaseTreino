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

    public void listarMedicamentos() {
        if (medicamentos.isEmpty()) {
            System.out.println("Nenhum medicamento cadastrado.");
            return;
        }

        System.out.println("Total de medicamentos cadastrados: " + medicamentos.size());
        
        for (Medicamento m : medicamentos) {
            System.out.println(m); // usa o toString que você já fez
        }
    }

    public void verificarEstoque() {
        if (medicamentos.isEmpty()) {
            System.out.println("Nenhum medicamento cadastrado.");
            return;
        }

        boolean achouSemEstoque = false;

        for (Medicamento m : medicamentos) {
            if (m.getEstoque() == 0) {
                System.out.println(m.getNome() + " está sem estoque");
                achouSemEstoque = true;
            }
        }

        if (!achouSemEstoque) {
            System.out.println("Todos os medicamentos têm estoque.");
        }
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
    
    public boolean removerMedicamento(String nome) {
        for (Medicamento m : medicamentos) {
            if (m.getNome().equalsIgnoreCase(nome.trim())) {
                medicamentos.remove(m);
                return true;
            }
        
        }
        return false;
    }
}

