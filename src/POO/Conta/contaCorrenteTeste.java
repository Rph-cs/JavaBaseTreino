package POO.Conta;

public class contaCorrenteTeste {
    
    public static void main(String[] args) {
        

        ClienteConta cliente = new ClienteConta();

        ContaCorrente conta = new ContaCorrente(cliente);

        conta.mostrarMenu();
        
    }
}
