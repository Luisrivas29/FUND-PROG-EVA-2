package eva2_19_validar_usuario;

import java.util.Scanner;


public class EVA2_19_VALIDAR_USUARIO {
    final static String NOMBRE_USUARIO = "Admin";
    final static String PASSWORD = "Admin";

    public static void main(String[] args) {
        
        String usuario, password;
        Scanner input = new Scanner(System.in);
        
        System.out.println(NOMBRE_USUARIO);
        System.out.println(PASSWORD);
        
        do{
            System.out.println("Introduce el usuario");
            usuario = input.nextLine();
            System.out.println("Introduce la contraseña");
            password = input.nextLine();
        
        }while(!usuario.equals(NOMBRE_USUARIO) || !password.equals(PASSWORD));
        System.out.println("ACCESO CONCEDIDO. BIENVENIDO ! !");
       
               
        
    }
    
}
