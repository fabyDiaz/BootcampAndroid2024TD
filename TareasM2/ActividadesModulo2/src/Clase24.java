import java.util.Scanner;

public class Clase24 {
    public static void main(String[] args) {

        /*
        Math.algo
        Pedir un número y pedir:
        el doble
        el triple
        la raíz cuadrada
        la potencia elevada a 7
         */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(n*2);
        System.out.println(n*3);
        System.out.println(Math.sqrt(n));
        System.out.println(Math.pow(n,7));
    }
}
