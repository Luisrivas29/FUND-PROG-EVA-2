
package eva2_5_operaciones;


public class EVA2_5_OPERACIONES {

    
    public static void main(String[] args) {
        
        int var1,var2,resu;
        
        var1 = 100;
        var2 = 200;
        
        //SUMA
        
        resu = var1 + var2;
        System.out.println(); //SATLTO DE LINEA (ENTER)
        System.out.println("SUMA: ");
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var1 + Var2 = " + resu);
        
        //RESTA
        
        resu = var1 - var2;
        System.out.println(); //SATLTO DE LINEA (ENTER)
        System.out.println("RESTA: ");
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var1 - Var2 = " + resu);
        
        //MULTIPLICACION
        
        resu = var1 * var2;
        System.out.println(); //SATLTO DE LINEA (ENTER)
        System.out.println("MULTIPLICACION: ");
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var1 x Var2 = " + resu);
        
        //DIVISION
        
        var1 = 15;
        var2 = 7;
               
        resu = var1 / var2;
       
        System.out.println(); //SATLTO DE LINEA (ENTER)
        System.out.println("DIVISION: ");
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var1 / Var2 = " + resu);
        
        //DIVISION FLOTANTE
        
        double resuExacto;
        
        resuExacto = var1 / var2;
       
        System.out.println(); //SATLTO DE LINEA (ENTER)
        System.out.println("DIVISION: ");
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var1 / Var2 = " + resuExacto);
        
        double var2F = 7;
        
        resuExacto = var1 / var2F;    
        
        System.out.println(); //SATLTO DE LINEA (ENTER)
        System.out.println("DIVISION EXACTA (¿SERA?: ");
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var1 / Var2 = " + resuExacto);
        
        int cifra = 7;
        double cifraDouble = 7.0;
        
        double division = 100 / 10; // SE TOMA EL DIVISOR COMO ENTERO
        //double division = 100 / 10.0; //SE TOMA EL DIVISOR COMO FLOTANTE
        
        //PRECEDENCIA DE OPERACIONES:
        
        int a = 5, b = 3, c = 2;
        int resultado = (a * b) + (a - c) * (b - a); // (15) + (3) * (-2) // 15-6 = 9
        
        System.out.println("RESULTADO PRECEDENCIA: " + resultado);
        
        //POTENCIAS Y RAICES:
        
        double potencia;
        potencia = Math.pow(5, 3);
        System.out.println("POTENCIA = " + potencia);
        
        
        
    }
    
}
