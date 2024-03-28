import java.util.Scanner;

public class Clase20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*1. Escribir un IF que evalúa si una variable número es positiva
            2. Escribir un IF_ELSE que evalúe si un número es par o impar.
            Debe devolver un mensaje por pantalla para cada caso. Si el número ingresado es cero,
            debe mostrar por pantalla un mensaje informándolo.

         */
        System.out.println("EJERCICIO 1");
        System.out.println("Ingrese un número");
        int n = scanner.nextInt();

        if (n>0){
            System.out.println("El número es positivo");
        }

        if (n == 0){
            System.out.println("El número es 0");
        }else{
            if (n%2==0){
                System.out.println("El número es par");
            }else{
                System.out.println("El número es impar");
            }
        }

        /*
        Completar un switch para un programa que lea un mes (1-12) y muestre por
        pantalla el nombre del mes con la estación del año correspondiente: invierno,
        primavera, otoño o verano.
         */

        System.out.println("EJERCICIO 2");

        System.out.println("Ingrese el numero del mes ");
        int mes =scanner.nextInt();

        switch (mes){
            case 1:
                System.out.println("Enero - Verano");
                break;
            case 2:
                System.out.println("Febrero - verano");
                break;
            case 3:
                System.out.println("Marzo - Otoño");
                break;
            case 4:
                System.out.println("Abril - Otoño");
                break;
            case 5:
                System.out.println("Mayo - Otoño");
                break;
            case 6:
                System.out.println("Junio - Invierno");
                break;
            case 7:
                System.out.println("Julio - Invierno");
                break;
            case 8:
                System.out.println("Agosto - Invierno");
                break;
            case 9:
                System.out.println("Septiembre - Primavera");
                break;
            case 13:
                System.out.println("Ocubre - Primavera");
                break;
            case 11:
                System.out.println("Noviembre - Primavera");
                break;
            case 12:
                System.out.println("Diciembre - Verano");
                break;
            default:
                System.out.println("El mes ingresado no es válido");
        }
    }
}
