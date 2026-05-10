package POO.SistemaRestaurante.Pedido;

import POO.SistemaRestaurante.Produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    List<Produto> produtos;
    
    Pedido () {
        produtos = new ArrayList<>();
    }
}
