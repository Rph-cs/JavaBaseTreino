package POO.SistemaRestaurante;

import POO.SistemaRestaurante.Cliente.Cliente;
import POO.SistemaRestaurante.Pedido.Pedido;
import POO.SistemaRestaurante.Pedido.StatusPedido;
import POO.SistemaRestaurante.Produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private List<Cliente> cliente;
    private List<Pedido> pedidos;
    private List<Produto> cardapio;
    
    public Restaurante() {
        this.cliente = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.cardapio = new ArrayList<>();
        
    }

    public boolean cpfJaExiste(String cpf) {

        for (Cliente c : cliente) {
            if (c.getCpf().trim().equals(cpf.trim())) {
                return true;
            }
        }

        return false;
    }
    
    public Cliente buscarCliente(String cpf) {
        
        for (Cliente c : cliente) {
            if (c.getCpf().trim().equals(cpf.trim())) {
                return c;
            }
        }
        
        return null;
    }
    
    public void cadastrarCliente(Cliente c) {
        cliente.add(c);
    }
    
    public void abrirPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    
    public void relatorio() {
        System.out.println("Total de pedidos: " + pedidos.size());

        int totalPedidosAbertos = 0;
        int totalPedidosFechados = 0;
        
        for (Pedido p : pedidos) {
            if (p.getStatusPedido() == StatusPedido.ABERTO) {
                totalPedidosAbertos++;
            } else {
                totalPedidosFechados++;
            }
        }

        System.out.println("Total pedidos abertos: " + totalPedidosAbertos);
        System.out.println("Total pedidos fechados: " + totalPedidosFechados);
        
        int totalArrecadado = 0;
        
        for (Pedido p : pedidos) {
            totalArrecadado += p.totalPedido();
        }

        System.out.println("Total arrecadado: " + totalArrecadado);
    }
    
    public void cadastrarProduto(Produto p) {
        cardapio.add(p);
    }
    
    public void cadastrarPedido(Pedido p) {
        pedidos.add(p);
    }
    
    
}
