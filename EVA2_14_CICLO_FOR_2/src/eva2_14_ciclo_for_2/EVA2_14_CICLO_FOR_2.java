package eva2_14_ciclo_for_2;

import java.util.Scanner;


public class EVA2_14_CICLO_FOR_2 {

    
    public static void main(String[] args) {
        
        int noCalifas;
        int sumaCalifas = 0; //cero es el neutro aditivo
                                       //1 es el neutro multplicativo
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el número de calificaciones: ");
        
        noCalifas = input.nextInt();
        
        for (int i = 1; i <= noCalifas; i++ ){
            System.out.println("Introduce la calificación: ");
            int califa = input.nextInt();
            //sumatoria de valores:
            //ACUMULADORES
            //sumaCalifas = sumaCalifas + califa;   
            sumaCalifas += califa;
          }
        
        //el preomedio es sumaCalifas/noCAlifas, pero ambos son enteros 
       //y dividir enteros en java da como resultado un entero, sin decimales
        
          double promedio = sumaCalifas / (noCalifas * 1.0);
          System.out.println("El promedio es " + promedio);
    }
    
}
