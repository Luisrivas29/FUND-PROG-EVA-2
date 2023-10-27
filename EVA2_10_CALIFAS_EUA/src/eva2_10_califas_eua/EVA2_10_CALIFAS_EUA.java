
package eva2_10_califas_eua;

import java.util.Scanner;


public class EVA2_10_CALIFAS_EUA {

    
    public static void main(String[] args) {
       int cal;
       Scanner input = new Scanner(System.in);
       
        System.out.println("Introduce tu calificacion");
        cal = input.nextInt();
        
        if((cal >= 90) && (cal <= 100))
            System.out.println("Sacaste A");
        else if((cal >= 80) && (cal <= 89)) 
            System.out.println("Sacaste B");
        else if((cal >= 70) && (cal <= 79))
            System.out.println("Sacaste C");
        else if ((cal >= 60) && (cal <= 69))
            System.out.println("Sacaste D");
        else if ((cal >= 0) && (cal <= 59))
            System.out.println("Sacaste F");
                    
    }
    
}
