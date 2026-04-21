package POO.Ventilador;

import java.util.Scanner;

public class VentiladorTeste {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Ventilador v = new Ventilador("Asuz", "AIOT");
        
        int op = 0;
        
        while (op != 4) {

            System.out.println("--MENU--");
            System.out.println("1 - Aumentar velocidade");
            System.out.println("2 - Diminuir velocidade");
            System.out.println("3 - Ver status ");
            System.out.println("4 - Sair");
            
            op = scanner.nextInt();
            
            switch (op) {
                
                case 1: v.aumentarVelocidade(); break;

                case 2: v.diminuirVelocidade(); break;

                case 3: v.mostrarStatus(); break;

                case 4: System.out.println("Encerrando o sistema..."); break; 
                
                default: System.out.println("Opção inválida");
            }
        }
        
    }
}
