import java.util.Scanner;

public class Clase18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Pedir al usuario dos números y mostrar su suma

        System.out.println("SUMA");
        System.out.println("Ingrese un número");
        int a = scanner.nextInt();

        System.out.println("Ingresa otro número");
        int b = scanner.nextInt();

        System.out.println(a + " + " + b + " = "+ (a+b));

        //Leer un número y mostrar su cuadrado elevándolo al exponenete 2

        System.out.println("========================");
        System.out.println("POTENCIA");
        System.out.println("Ingrese un número");
        a = scanner.nextInt();

        System.out.println("El cuadrado de " + a + " es " + Math.pow(a,2) );

        //leer dos palabras y concatenarlas en una frase

        scanner.nextLine();
        System.out.println("========================");
        System.out.println("LEER DOS PALABRAS");
        System.out.println("Ingrese la primera palabra");
        String palabra1 = scanner.nextLine();
        System.out.println("Ingrese la segunda palabra");
        String palabra2 = scanner.nextLine();

        System.out.println(palabra1 + " " + palabra2);

        //Pedir don números y comparar si son iguales con == mostrando el resultado
        System.out.println("========================");
        System.out.println("SON IGUALES");
        System.out.println("Ingrese un número");
        a = scanner.nextInt();
        System.out.println("Ingrese otro número");
        b = scanner.nextInt();

        if (a == b) {
            System.out.println("Los numeros ingresdos son iguales: " + a + "=" +  b );
        }else{
            System.out.println("Los numeros ingresdos son distintos: " + a + "≠" +  b );
        }

    }

}
