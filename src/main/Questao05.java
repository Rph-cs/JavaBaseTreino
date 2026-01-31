package main;

import java.util.Scanner;

/*
 QUESTÃO 05 — Contagem de números pares e ímpares

 Faça um programa que:

 - Leia números inteiros do usuário repetidamente
 - A leitura continua até que o usuário digite 0
 - Ao final, mostre:
    - Quantos números pares foram digitados
    - Quantos números ímpares foram digitados
    - A soma de todos os números positivos
    - A soma de todos os números negativos

 Observações:
 - O número 0 serve apenas para parar a leitura, **não entra em nenhum cálculo**
*/

public class Questao05 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int numero, quantidadePares = 0, quantidadeImpares = 0, somaPositivos = 0, somaNegativos = 0;
        
        System.out.println("Digite um número(0 para parar): ");
        numero = scanner.nextInt();
        
        while(numero != 0) {
            
            if(numero % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
            
            
            if(numero < 0) {
                somaNegativos = somaNegativos + numero;
            } else {
                somaPositivos = somaPositivos + numero;
            }
            
            System.out.println("Digite um número(0 para parar): ");
            numero = scanner.nextInt();
        }
        
        System.out.format("Foram digitados %d números pares e %d números impares%n", quantidadePares, quantidadeImpares);
        System.out.format("Soma total números positivos: %d%nSoma total números negativos: %d", somaPositivos, somaNegativos);
    }
}
