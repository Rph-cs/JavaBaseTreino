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
    
    public Cliente buscarCliente(String cpf) {
        
        for (Cliente c : cliente) {
            if (c.getCpf().trim().equals(cpf.trim())) {
                return c;
            }
        }
        
        return null;
    }

    public Pedido buscarPedido(String cpf) {
        for (Pedido p : pedidos) {
            if (p.getCpfCliente().trim().equals(cpf.trim())
                    && p.getStatusPedido() == StatusPedido.ABERTO) {
                return p;
            }
        }
        return null;
    }
    
    public Produto buscarProdutoCardapio(String nome) {
        for (Produto p : cardapio) {
            if (p.getNome().trim().equals((nome.trim()))) {
                return p;
            }
        }
        return null;
    }
    public void cadastrarCliente(Cliente c) {
        cliente.add(c);
    }

    public void listarCardapio() {
        
        if (cardapio.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        for (Produto p : cardapio) {
            if (p.isDisponivel()) {
                System.out.println(p);
            }
        }
    }
    
    public boolean temProdutoDisponivel() {
        for (Produto p : cardapio) {
            if (p.isDisponivel()) {
                return true;
            }
        }
        return false;
    }
    
    public void exibirRelatorio() {
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
        
        double totalArrecadado = 0;
        
        for (Pedido p : pedidos) {
            if (p.getStatusPedido() == StatusPedido.FECHADO) {
                totalArrecadado += p.totalPedido();
            }
        }

        System.out.printf("Total arrecadado: %.2f", totalArrecadado);
    }
    
    public void cadastrarProduto(Produto p) {
        cardapio.add(p);
    }
    
    public void cadastrarPedido(Pedido p) {
        pedidos.add(p);
    }
    
}
