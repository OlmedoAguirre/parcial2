package Usuario;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class usuario {
    private String user;
    private String mail;
    private String password;

    public usuario(String user, String mail, String password){
        this.user = user;
        this.mail = mail;
        this.password = password;
    }

    public String getuser(){
        return this.user;
    }
    public String getMail(){
        return this.mail;
    }
    public String getPassword(){
        return this.password;
    }

    public String Info(){
        return "Usuario: " + user + "\nCorreo: " + mail + "\nContrasena " + password;
    }

    public void LogIn(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su usuario");
        String usuario = sc.nextLine();

        System.out.println("Introduzca su correo");
        String correo = sc.nextLine();

        System.out.println("Introduzca su contrasena");
        String contrasena = sc.nextLine();

        Pattern pattern = Pattern.compile(password);
        Matcher matcher = pattern.matcher(contrasena);
        if (matcher.find()) {
            System.out.println("Inicio de sesion exitoso");
        }
        else {System.out.println("Contrasena incorrecta");}
    }


}