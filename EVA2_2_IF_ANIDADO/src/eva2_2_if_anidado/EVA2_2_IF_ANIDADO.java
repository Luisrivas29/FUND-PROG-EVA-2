/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_if_anidado;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_IF_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int valor1, valor2;
    Scanner input = new Scanner(System.in);
    
        System.out.println("Valor 1: ");
        valor1 = input.nextInt();
        
        System.out.println("Valor 2: ");
        valor2 = input.nextInt();
        
        // <> operadores
        if(valor1 > valor2) //verdad                     //concatenar
            System.out.println("El valor mas grande es el " + valor1);
            else{ //falso
                //if anidado: if dentro de otro if
                // = asignacion
                // == comparacion
                if(valor1 == valor2)
                    System.out.println("Ambos valores son iguales");
                else
                    System.out.println("El valor mas pequeño es " + valor1);
               }
           
        }        
    }
    

