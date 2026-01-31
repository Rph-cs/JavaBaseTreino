package main;

import java.util.Scanner;

/*
 QUESTÃO 06 — Três positivos consecutivos

 Faça um programa que:

 - Leia números inteiros do usuário repetidamente
 - A leitura continua até que o usuário digite 0
 - O programa deve detectar se **existem 3 números positivos consecutivos**
 - Ao final, mostre apenas uma das mensagens:

 - "Três positivos consecutivos detectados" → se ocorrer
 - "Não houve três positivos consecutivos" → caso contrário

 Observações:
 - Números negativos ou zero quebram a sequência de positivos
 - O número 0 serve apenas para parar a leitura
 */
public class Questao6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero, sequencia = 0;
        String resposta = null;

        System.out.println("Digite um número(0 para parar): ");
        numero = scanner.nextInt();

        while (numero != 0) {
            
            if (numero > 0) {
                sequencia++;
                if (sequencia == 3) {
                    resposta = "Três positivos consecutivos detectados";
                    break;
                } else {
                    resposta = "Não houve três positivos consecutivos";
                }
            } else {
                sequencia = 0;
            }

            System.out.println("Digite um número(0 para parar): ");
            numero = scanner.nextInt();

        }
        System.out.println(resposta);
    }

}
