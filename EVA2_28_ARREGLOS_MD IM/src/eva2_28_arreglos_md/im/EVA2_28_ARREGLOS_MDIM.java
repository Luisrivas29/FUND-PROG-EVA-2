package eva2_28_arreglos_md.im;


public class EVA2_28_ARREGLOS_MDIM {

    
    public static void main(String[] args) {
      
        //ARREGLO DE DOS DIMENSIONES: MATRIZ
        //filas, columnas
        int[][] matriz = new int[5][10];
        
        //ASIGNAR UN VALOR:
        
        matriz[1][3] = 100;
        System.out.println("Valor en [1][3] = " + matriz[1][3]);
        System.out.println("");
        
        System.out.println("matriz.length = " + matriz.length);
        System.out.println("");
                
        
        //matriz.length siempre es la primera dimensión
        
        for (int i = 0; i < matriz.length; i++){ //filas
            for (int j = 0; j < matriz[i].length; j++){ //columnas
                matriz[i][j] = (int) (Math.random() * 100);
             }
         }
        
        //LEER NUESTRO ARREGLO
         for (int i = 0; i < matriz.length; i++){ //filas
            for (int j = 0; j < matriz[i].length; j++){ //columnas
                System.out.print("[" + matriz[i][j] + "]");
            
        }
             System.out.println("");
            
            
        }
        
        
        
        
        
    }
    
}
