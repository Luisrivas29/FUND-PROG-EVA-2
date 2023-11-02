package eva2_18_do_while;

import java.util.Scanner;


public class EVA2_18_DO_WHILE {

    
    public static void main(String[] args) {
        
        int nume;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("Intenta adivinar el numero");
            nume = input.nextInt();
        }while(nume != 100);
        System.out.println("ADIVINASTE ! !");
       
    }
    
}
