import java.util.Scanner;

public class Clase25 {

    public static void main(String[] args) {

        //Crear un archivo .jar

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ingrese edad");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese su ocupación");
        String ocupacion = scanner.nextLine();

        System.out.println("NOMBRE: "+nombre);
        System.out.println("EDAD: "+ edad);
        System.out.println("OUCPACIÓN: "+ocupacion);

    }
}
