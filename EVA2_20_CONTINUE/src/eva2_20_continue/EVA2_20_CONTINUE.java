package eva2_20_continue;


public class EVA2_20_CONTINUE {

   
    public static void main(String[] args) {
        
        for (int i = 1; i <= 15; i++){
            if(i == 10)
                break;
            System.out.print(i + " - ");
        }
        
        System.out.println("");
        
          for (int i = 1; i <= 15; i++){
            if(i == 10)
                continue;
            System.out.print(i + " - ");
        }
        
       
    }
    
}
