/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_2_1_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_2_1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int califa;
       Scanner input = new Scanner(System.in);
       System.out.println("Introduce la calificacion:");
       califa = input.nextInt();
       
        if(califa >= 70){ //if(expresion a evaluar)
            System.out.println("Aprobaste!!");
            System.out.println("Quema tus apuntes!!");
        }else // esto se ejecuta si es falso, es opcional
            System.out.println("No aprobaste");
       
    }
    
}
