package main;

import java.util.Scanner;

/*
 QUESTÃO 03 — Contagem regressiva

 Faça um programa que:

 - Leia um número inteiro positivo
 - Se o número for menor ou igual a zero, mostre:
   "Número inválido"
 - Caso contrário:
   - Mostre todos os números do valor digitado até 0
   - Um número por linha

 Exemplo:
 Entrada: 3
 Saída:
 3
 2
 1
 0
*/

public class Questao03 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int numero;
                
        System.out.println("Digite um número: ");
        numero = scanner.nextInt();
        
        if(numero <= 0) {
            System.out.println("Número inválido");
        } else {
            while(numero >= 0) {
                System.out.println(numero);
                numero--;
            }
        }
    } 
    
}
