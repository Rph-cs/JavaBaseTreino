package POO.AluraContaBancaria;

import java.util.Random;

public class ContaBancaria {
    private String nome;
    private TipoConta conta;
    private double saldo;
    
    ContaBancaria(String nome) {
        this.nome = nome;
        this.conta = TipoConta.CORRENTE;
        saldo = gerarSaldoAleatorio();
    }

    private double gerarSaldoAleatorio() {
        Random random = new Random();
        return Math.round((random.nextDouble(700) + 300) * 100.0) / 100.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void receberValor(double valor) {
        if (valor <= 0) {
            System.out.println("\nNão é possível receber valores negativos");
            return;
        }
        saldo += valor;
        saldo = Math.round(saldo * 100.0) / 100.0;
        
        System.out.printf("Saldo atual: %.2f%n", saldo);
        
    }

    public void transferirValor(double valor) {
        if (valor > saldo) {
            System.out.println("\nnão é possível transferir um valor maior que o saldo atual");
            return;
        }

        if (valor <= 0) {
            System.out.println("\nNão é possível receber valores negativos");
            return;
        }
        
        saldo -= valor;
        
        System.out.println("\nValor transferido com sucesso!");
        System.out.printf("\nSaldo atual: %.2f%n", saldo);
    }
}
