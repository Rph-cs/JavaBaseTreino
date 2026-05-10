package POO.SistemaRestaurante.Pedido;

import POO.SistemaRestaurante.Cliente.Cliente;
import POO.SistemaRestaurante.Produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private StatusPedido statusPedido;
    private List<Produto> produtos;
    
    
    public Pedido (Cliente cliente) {
        this.cliente = cliente;
        this.statusPedido = StatusPedido.ABERTO;
        
        produtos = new ArrayList<>();
    }
    
    public boolean podeEncerrarPedido() {
        return statusPedido == StatusPedido.ABERTO && !produtos.isEmpty();
    }
    
    public void encerrarPedido() {
        statusPedido = StatusPedido.FECHADO;
    }

    public boolean adicionarProduto(Produto p) {
        if (p.isDisponivel()) {
            produtos.add(p);
            return true;
        }
        return false;
    }
    public double totalPedido() {
        double total = 0;
        
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        return total;
    }

    public int totalTempoPreparo() {
        int totalTempo = 0;

        for (Produto p : produtos) {
            totalTempo += p.getTempoPreparo();
        }
        return totalTempo;
    }

    public void exibirPedido() {
        System.out.println("Cliente: " + getNomeCliente());
        System.out.println("Status: " + statusPedido);
        System.out.println("Produtos:");
        for (Produto p : produtos) {
            System.out.println(p);
        }
        System.out.printf("Total: R$ %.2f%n", totalPedido());
        System.out.println("Tempo estimado: " + totalTempoPreparo() + " minutos");
    }

    
    public boolean valorPagoSuficiente(double valorPago) {
        return valorPago >= totalPedido(); 
    }
    
    public double calcularTroco(double valorPago) {
        double troco = valorPago - totalPedido();
        
        return troco;
    }
    
    public String getCpfCliente() {
        return cliente.getCpf();
    }
    
    public String getNomeCliente() {
        return cliente.getNome();
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }
}
