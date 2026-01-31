package main;

import java.util.Scanner;

/*
 QUESTÃO 01 — Número positivo ou negativo

 Um programa deve ler um número inteiro informado pelo usuário.

 Regras:
 - Se o número for positivo, mostrar: "Número positivo"
 - Caso contrário, mostrar: "Número negativo ou zero"

 Entrada:
 - Um número inteiro

 Saída:
 - Apenas uma mensagem conforme as regras acima
*/

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int numero = 0;
        
        System.out.println("Digite um número: ");
        numero = scanner.nextInt();
        
        if(numero <= 0) {
            System.out.println("Número negativo ou zero");
        } else {
            System.out.println("Número positivo");
        }              
                
    }
    
}
