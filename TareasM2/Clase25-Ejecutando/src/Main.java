
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crear un archivo .jar

        Scanner scanner = new Scanner(System.in);
        //Mensaje de Bienvenida
        System.out.println("");
        System.out.println("BIENVENIDO A MI PRIMER PROGRAMA :)");
        System.out.println("");

        //Solicio el nombre
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        scanner.nextLine();
        System.out.println("===============================");

        //Solicito la edad
        System.out.println("Ingrese edad");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("===============================");

        //Solicito la ocupación
        System.out.println("Ingrese su ocupación");
        String ocupacion = scanner.nextLine();
        System.out.println("");
        System.out.println("===============================");

        //Muestro los datos
        System.out.println("Los datos ingresados son: ");
        System.out.println("NOMBRE: "+nombre);
        System.out.println("EDAD: "+ edad);
        System.out.println("OUCPACIÓN: "+ocupacion);
    }
}