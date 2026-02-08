package main;

import java.util.Scanner;
/*
 QUESTÃO 11 — Sistema de atendimento por prioridade

 Um sistema controla o atendimento de clientes baseado em prioridade.

 Regras do sistema:

 - Cada cliente possui uma prioridade:
    1 → Alta
    2 → Média
    3 → Baixa
 - O sistema lê os códigos de prioridade repetidamente
 - A leitura continua até que o código 0 seja digitado
 - Qualquer outro código é considerado inválido
 - O sistema deve:
    - Contar quantos clientes chegaram de cada prioridade
    - Determinar qual cliente será atendido primeiro:
        → Sempre atende clientes de maior prioridade primeiro
        → Se houver empate na prioridade, atende o cliente que chegou primeiro
   - Detectar se em algum momento houver **2 clientes de alta prioridade seguidos**
        e mostrar um aviso: "Fila crítica detectada"

 Exemplo 1:
 Entrada:
 2
 1
 3
 0
 Saída:
 Clientes Alta prioridade: 1
 Clientes Média prioridade: 1
 Clientes Baixa prioridade: 1
 Primeiro atendimento: Alta prioridade
*/

public class Questao11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int codigo = 0, totalClientesAlta = 0, totalClientesMedia = 0, totalClientesBaixa = 0, clientesAltaConsecutivos = 0;
        String aviso = "Não houve fila crítica detectada";
        String prioridade = "Nenhuma prioridade";

        do {
            System.out.println("Digite o código: ");
            codigo = scanner.nextInt();

            if (codigo == 0) {
                break;
            }

            switch (codigo) {

                case 1:
                    totalClientesAlta++;
                    clientesAltaConsecutivos++;

                    if (clientesAltaConsecutivos >= 2 && aviso.equals("Não houve fila crítica detectada")) {
                        aviso = "Houve fila crítica detectada";
                    }

                    if (!prioridade.equals("Alta prioridade")) {
                        prioridade = "Alta prioridade";
                    }

                    break;

                case 2:
                    totalClientesMedia++;
                    clientesAltaConsecutivos = 0;

                    if (!prioridade.equals("Alta prioridade") && !prioridade.equals("Média prioridade")) {
                        prioridade = "Média prioridade";
                    }

                    break;

                case 3:
                    totalClientesBaixa++;
                    clientesAltaConsecutivos = 0;

                    if (!prioridade.equals("Alta prioridade") && !prioridade.equals("Média prioridade") && !prioridade.equals("Baixa prioridade")) {
                        prioridade = "Baixa prioridade";
                    }

                    break;

                default:
                    System.out.println("Código inválido");

            }

        } while(true);

        System.out.format("Clientes Alta prioridade: %d %n", totalClientesAlta);
        System.out.format("Clientes Média prioridade: %d %n", totalClientesMedia);
        System.out.format("Clientes Baixa prioridade: %d %n", totalClientesBaixa);
        System.out.format("Primeiro atendimento: %s %n", prioridade);
        System.out.println(aviso);

    }
}
