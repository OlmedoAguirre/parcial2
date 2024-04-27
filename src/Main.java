import Usuario.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su Usuario: ");
        String usuario = sc.nextLine();
        System.out.println("Introduzca su correo: ");
        String correo = sc.nextLine();
        System.out.println("Introduzca su contrasena: ");
        String contrasena = sc.nextLine();

        usuario user1  = new usuario(usuario, correo, contrasena);

        System.out.println("1. Ingresar");
        System.out.println("2.Olvide mi usuario y contrasena");

        int e = sc.nextInt();

        switch (e){
            case 1:
                user1.LogIn();
                break;
            case 2:
                System.out.println(user1.Info());
        }

    }
}