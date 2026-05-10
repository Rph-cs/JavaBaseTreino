package POO.SistemaRestaurante.Pedido;

import POO.SistemaRestaurante.Cliente.Cliente;
import POO.SistemaRestaurante.Produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private StatusPedido statusPedido;
    private List<Produto> produtos;
    
    
    Pedido (Cliente cliente) {
        this.cliente = cliente;
        this.statusPedido = StatusPedido.ABERTO;
        
        produtos = new ArrayList<>();
    }
    
    public boolean podeEncerrarPedido() {
        return statusPedido == StatusPedido.ABERTO;
    }
    
    public void encerrarPedido() {
        statusPedido = StatusPedido.FECHADO;
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

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }
}
