package main;

import java.util.Scanner;

/*
 QUESTÃO 08 — Menu de operações

 Faça um programa que:

 - Mostre um menu com as opções:
 1 → Somar dois números
 2 → Subtrair dois números
 3 → Valor absoluto de um número
 4 → Sair

 - O programa deve:
 - Ler a opção escolhida
 - Executar a operação correspondente usando SWITCH
 - Repetir o menu até que o usuário escolha a opção 4

 Regras:
 - Use DO WHILE
 - Para valor absoluto, utilize Math.abs()
 - Se a opção for inválida, mostrar: "Opção inválida"

 Entrada:
 - Opção do menu
 - Números necessários para a operação

 Saída:
 - Resultado da operação escolhida
 */
public class Questao08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int op = 0, n1 = 0, n2 = 0, totalSoma = 0, totalSubtracao = 0, numeroAbs = 0;

        do {
            System.out.println("--MENU--");
            System.out.println("1 - Somar dois números");
            System.out.println("2 - Subtrair dois números");
            System.out.println("3 - Valor absoluto de um número");
            System.out.println("4 - Sair");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o primeiro número para a soma: ");
                    n1 = scanner.nextInt();

                    System.out.println("Digite o segundo número para a soma: ");
                    n2 = scanner.nextInt();

                    totalSoma = n1 + n2;

                    System.out.format("O resultado da soma é: %d%n", totalSoma);
                    break;

                case 2:
                    System.out.println("Digite o primeiro número para a subtração: ");
                    n1 = scanner.nextInt();

                    System.out.println("Digite o segundo número para a subtração: ");
                    n2 = scanner.nextInt();

                    totalSubtracao = n1 - n2;

                    System.out.format("O resultado da subtração é: %d%n", totalSubtracao);
                    break;

                case 3:
                    System.out.println("Digite um número: ");
                    numeroAbs = scanner.nextInt();

                    System.out.println(Math.abs(numeroAbs));
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (op != 4);

    }
}
