package main;

import java.util.Scanner;

/*
 QUESTÃO 02 — Classificação de nota

 Um programa deve ler uma nota inteira de 0 a 10.

 Regras:
 - Se a nota for menor que 5, mostrar: "Reprovado"
 - Se a nota for 5 ou 6, mostrar: "Recuperação"
 - Se a nota for maior ou igual a 7, mostrar: "Aprovado"

 Entrada:
 - Uma nota inteira (0 a 10)

 Saída:
 - Apenas uma mensagem de acordo com as regras acima
*/

public class Questao02 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int nota;
        
        System.out.println("Digite uma nota de 0 a 10: ");
        nota = scanner.nextInt();
        
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida");
        } else if (nota < 5) {
        System.out.println("Reprovado");
        } else if (nota <= 6) {
        System.out.println("Recuperação");
        } else {
        System.out.println("Aprovado");
        }
        
    }
    
}
