package com.mycompany.eva2_12_carreras;

import java.util.Scanner;


public class EVA2_12_CARRERAS {

    public static void main(String[] args) {
         String carrera;
         Scanner input = new Scanner(System.in);
         
         System.out.println("Introduce la abreviación de la caarrera");
         carrera = input.nextLine();
        
         switch(carrera) {
             case ("ISC"):
                     System.out.println("Ingenieria en Sistemas Computacionales");
                    break;
             case ("INF"):
                     System.out.println("Ingenieria Informatica");
                    break;
             case ("IND"):
                     System.out.println("Ingenieria Industrial");
                    break;
             case ("IDI"):
                     System.out.println("Ingenieria en Diseño Industrial");
                    break;
             case ("LA"):
                     System.out.println("Licenciatura en Administracion");
                    break;    
             case ("IGE"):
                     System.out.println("Ingenieria de Gestion Empresarial");
                    break;
             case ("ARQ"):
                     System.out.println("Arquitectura");
                    break;
             default:
                   System.out.println("Valor no valido");
                    
         }
       
    }
}
