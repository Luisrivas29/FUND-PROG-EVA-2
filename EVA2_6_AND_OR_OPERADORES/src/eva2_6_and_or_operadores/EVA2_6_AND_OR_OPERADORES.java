package eva2_6_and_or_operadores;

import java.util.Scanner;


public class EVA2_6_AND_OR_OPERADORES {

   
    public static void main(String[] args) {
       
     int califa;
     Scanner input = new Scanner(System.in);
     
    System.out.println("Introduce la calificacion: ");
    califa = input.nextInt();
    
    //VALIDAR
    //UNA CALIFA ES MAYOR O IGUAL A 100--> califa >= 0
    //Y --> &&
    //LA CALIFA ES MENOR O IGUAL A 100--> califa <= 100
    
    if((califa >=0) && (califa <= 100)){ //VALOR VALIDO
        System.out.println("La calificacion " + califa + " es valida!!");    
        if(califa >= 70)
            System.out.println("APROBADO");
        else
            System.out.println("NO ACREDITADO");
        
    } else{
        System.out.println("La calificacion " + califa + " no es valida!!");
    }
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
