
package eva2_11_tallas;

import java.util.Scanner;


public class EVA2_11_TALLAS {

    
    public static void main(String[] args) {
        
        int talla;
        Scanner input = new Scanner(System.in);
       
        System.out.println("Introduce tu talla");
        talla = input.nextInt();
        
        switch(talla) {
           
            case 29:
                System.out.println("Tu talla es small");
                break;
            
            case 42:
                System.out.println("Tu talla es medium");
                break;
            case 44:
                System.out.println("Tu talla es large");
                break;
            case 48:
                System.out.println("Tu talla es xlarge");
                break;
                
            default:
                System.out.println("No es una talla valida");
       
           
           
           
       }
        
    }
    
}
