package main;

import java.util.Scanner;
/*
 QUESTÃO 12 — Verificação de senha

 Faça um programa que:

 - Peça ao usuário que digite uma senha repetidamente
 - A leitura continua até que o usuário digite a senha correta ("1234")
 - Se a senha digitada estiver incorreta, mostre uma mensagem de erro
 - Quando o usuário digitar a senha correta, mostre uma mensagem de sucesso

 Observações:
 - Use um laço do while
*/

public class Questao12 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String senha = null;
        
         do {
             System.out.println("Digite a senha: ");
             senha = scanner.next();
             
             if (!senha.equals("1234")) {
                 System.out.println("Senha incorreta, tente novamente");
             }
             
         } while(!senha.equals("1234"));
         
         System.out.println("Senha correta");
    }
}
