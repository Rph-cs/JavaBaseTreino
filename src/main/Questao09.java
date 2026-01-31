package main;

import java.util.Scanner;
/*
 QUESTÃO 09 — Sistema de verificação

 Um sistema recebe códigos numéricos repetidamente.

 O programa deve:

 - Ler códigos inteiros usando DO WHILE
 - O sistema continua ativo até que o código 0 seja digitado

 Regras de verificação:

 - Código 1:
 → Mostrar "Operação autorizada"

 - Código 2:
 → Pedir um número inteiro
 → Se o número for PAR, mostrar "Operação autorizada"
 → Se for ÍMPAR, mostrar "Operação negada"

 - Código 3:
 → Pedir um número inteiro
 → Mostrar o VALOR ABSOLUTO desse número

 - Código 4:
 → Pedir dois números inteiros
 → Mostrar o MAIOR deles

 - Qualquer outro código:
 → Mostrar "Código inválido"

 Regras importantes:
 - O código 0 encerra o sistema
 - O valor 0 NÃO deve ser processado
 - Use SWITCH para tratar os códigos
 - Use Math.abs quando necessário

 Exemplo:
 Entrada:
 2
 7
 4
 10
 3
 -8
 9
 0

 Saída:
 Operação negada
 10
 8
 Código inválido
 */

public class Questao09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int codigo = 0, n1 = 0, n2 = 0, numeroAbs = 0;

        do {
            System.out.println("\n--MENU--");
            System.out.println("Codigo 1: Operação simples");
            System.out.println("Codigo 2: Verificar par ou ímpar");
            System.out.println("Codigo 3: Valor absoluto");
            System.out.println("Codigo 4: Maior entre dois números");
            System.out.println("0 - Sair");
            System.out.print("Digite o código: ");
            codigo = scanner.nextInt();

            if (codigo == 0) {
                break;
            }
            
            switch (codigo) {
                case 1:
                    System.out.println("Operação autorizada");
                    break;

                case 2:
                    System.out.println("Digite um número: ");
                    n1 = scanner.nextInt();

                    if (n1 % 2 == 0) {
                        System.out.println("Operação autorizada");
                    } else {
                        System.out.println("Operação negada");
                    }
                    break;

                case 3:
                    System.out.println("Digite um número: ");
                    numeroAbs = scanner.nextInt();
                    
                    System.out.println("O valor absoluto de " +numeroAbs+ " é: " +Math.abs(numeroAbs));
                    break;
                
                case 4:
                    System.out.println("Digite o primeiro número: ");
                    n1 = scanner.nextInt();
                    
                    System.out.println("Digite o segundo número: ");
                    n2 = scanner.nextInt();
                    
                    System.out.println("O maior deles é: " + Math.max(n1, n2));
                    break;
                    
                default:
                    System.out.println("Código inválido");
            }

        } while (true);

        System.out.println("\nSistema encerrado.");
        
    }
}
