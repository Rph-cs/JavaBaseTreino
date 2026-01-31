package main;

import java.util.Scanner;
/*
 QUESTÃO 10 — Controle de acesso por tentativas

 Um sistema controla o acesso de usuários por meio de códigos numéricos.

 O sistema deve ler códigos inteiros repetidamente.

 Regras do sistema:

 - Cada código digitado representa uma tentativa de acesso
 - Códigos positivos representam tentativas válidas
 - Códigos negativos representam tentativas bloqueadas
 - O código 0 encerra o sistema

 Durante a execução, o sistema deve:

 - Contar o total de tentativas válidas
 - Contar o total de tentativas bloqueadas
 - Detectar se ocorreram 3 tentativas bloqueadas consecutivas
 - Se ocorrerem 3 tentativas bloqueadas consecutivas, o sistema deve registrar o evento

 Ao final, o sistema deve exibir:

 - Total de tentativas válidas
 - Total de tentativas bloqueadas
 - Se houve ou não bloqueio por segurança

 Regras importantes:
 - O código 0 serve apenas para encerrar a leitura
 - O código 0 NÃO deve entrar em nenhuma contagem
 */

public class Questao10 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int codigo = 0, totalTentativasValidas = 0, totalTentativasBloqueadas = 0, bloqueadosConsecutivos = 0;
        String registroEvento = "Não houve bloqueio por segurança";

        do {
            System.out.println("Digite o código");
            codigo = scanner.nextInt();

            if (codigo == 0) {
                break;
            }
            if (codigo > 0) {
                totalTentativasValidas++;
                bloqueadosConsecutivos = 0;
            } else {
                totalTentativasBloqueadas++;
                bloqueadosConsecutivos++;

                if (bloqueadosConsecutivos >= 3 && registroEvento.equals("Não houve bloqueio por segurança")) {
                    registroEvento = "Houve bloqueio por segurança";
                }
            }

        } while (true);
        
        System.out.format("Total de tentativas válidas: %d%n", totalTentativasValidas);
        System.out.format("Total de tentativas bloqueadas: %d%n", totalTentativasBloqueadas);
        System.out.println(registroEvento);
        
        
        
    }
}
