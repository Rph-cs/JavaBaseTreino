package POO.Lampada;

import java.util.Scanner;

public class LampadaTeste {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Lampada lampada = new Lampada("L1", "Xingiling");
        
        lampada.desligarLampada();
        lampada.ligarLampada();
        lampada.ligarLampada();
        
        
        
        
    }
    
}

