package main;

import java.util.Scanner;

/*
 QUESTÃO 04 — Soma até parar

 Faça um programa que:

 - Leia números inteiros do usuário
 - A leitura deve continuar até que o número 0 seja digitado
 - O número 0 NÃO deve entrar na soma
 - Ao final, mostre a soma total dos números digitados

 Exemplo:
 Entrada:
 5
 2
 -1
 0

 Saída:
 Total = 6
 */
public class Questao04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero, soma = 0;

        System.out.println("Digite um número(0 para parar): ");
        numero = scanner.nextInt();

        while (numero != 0) {
            soma = soma + numero;

            System.out.println("Digite um número(0 para parar): ");
            numero = scanner.nextInt();
        }

        System.out.format("total: %d", soma);

    }

}
