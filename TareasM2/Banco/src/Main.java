import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Clase 30 Ejercicios 27,28 y 29

        Scanner scanner = new Scanner(System.in);
        CuentaBancaria cuenta1 = new CuentaBancaria(123,"Fabiola Díaz", 5000.00);
        System.out.println("Datos de la cuenta: ");
        System.out.println("N° Cuenta: "+ cuenta1.getNumeroDeCuenta());
        System.out.println("Titular: "+cuenta1.getTitular());
        System.out.println("Saldo: "+cuenta1.getSaldo());

        System.out.println("Ingrese monto:");
        double monto= scanner.nextInt();

        cuenta1.ingresarDinero(monto);
        System.out.println("Saldo Actual: "+cuenta1.getSaldo());

    }
}