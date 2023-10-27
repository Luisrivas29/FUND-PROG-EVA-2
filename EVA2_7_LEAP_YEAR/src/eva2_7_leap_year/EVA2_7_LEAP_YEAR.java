package eva2_7_leap_year;

import java.util.Scanner;


public class EVA2_7_LEAP_YEAR {

    
    public static void main(String[] args) {
        int year, resi4, resi100, resi400;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el año");
        year = input.nextInt();
        
        resi4 = year % 4;
        resi100 = year % 100;
        resi400 = year % 400;
        
        if((resi4 == 0) && ((resi100 != 0) || (resi400 == 0)))//DIFERENTE: !=
            System.out.println("El año " + year + " es bisiesto!!");
        else
            System.out.println("El año " + year + " NO es bisiesto!!");
        
        
        
        
        }
    }

