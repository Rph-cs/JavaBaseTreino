package main;

import java.util.Scanner;
/*
 QUESTÃO 07 — Média até parar

 Faça um programa que:

 - Leia números inteiros do usuário
 - A leitura continua até que o usuário digite 0
 - O número 0 NÃO deve entrar nos cálculos
 - Ao final, mostre:
 - A soma de todos os números digitados
 - A quantidade de números digitados
 - A média dos números (soma / quantidade)

 Observações:
 - O programa deve usar DO WHILE
 - O número 0 serve apenas para parar a leitura

 Exemplo:
 Entrada:
 4
 6
 10
 0

 Saída:
 Soma = 20
 Quantidade = 3
 Média = 6.66
 */

public class Questao07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 0, soma = 0, quantidadeNumeros = 0;
        double media = 0;

        do {
            System.out.println("Digite um número(0 para sair): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                soma += numero;
                quantidadeNumeros++;
            }

        } while (numero != 0);

        if (quantidadeNumeros > 0) {
            media = (double) soma / quantidadeNumeros;
            System.out.format(
                    "A soma total dos numeros digitados: %d%nQuantidade de numeros digitados: %d%nMédia: %.2f%n",
                    soma, quantidadeNumeros, media
            );
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }
    }
}
