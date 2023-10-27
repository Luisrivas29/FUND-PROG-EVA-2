
package eva2_4_año_bisiesto;

import java.util.Scanner;


public class EVA2_4_AÑO_BISIESTO {

    
    public static void main(String[] args) {
        int residuo, year;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el año");
        year = input.nextInt();
        
        residuo = year % 4;
        
        if(residuo == 0){
                residuo = year % 100;
                if(residuo > 0)
                    System.out.println("Es año bisiesto");
                    
                    else{
                        residuo = year % 400;
                        if(residuo == 0)
                            System.out.println("Es año bisiesto");
                        else 
                            System.out.println("No es año bisiesto");
                            }
                   
              
        } else
            System.out.println("No es año bisiesto");
        }
    }

      
       
       
 
                        
        
   
    
        
        
        