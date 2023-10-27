/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_3_modulo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_3_MODULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int valor, residuo;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el valor");
        valor = input.nextInt();
        
        residuo = valor % 2; //% modulo --> residuo
        
        if(residuo == 0) //valor es par
            System.out.println("El valor es par");
        else
            System.out.println("El valor es impar");
        
        
    }
    
}
