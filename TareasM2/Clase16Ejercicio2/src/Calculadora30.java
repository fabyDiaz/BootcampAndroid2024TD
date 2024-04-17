import java.util.Scanner;

public class Calculadora30 {

    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;
        int continuar = 1;
        int num1;
        int num2;

        do{

            num1 = validarNumero();
            num2 = validarNumero();

            System.out.println("Ingresa la operación que quieres realizar");
            System.out.println("1.Suma\n2.Resta\n3.Multiplicación\n4.División");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    suma(num1,num2);
                    break;
                case 2:
                    resta(num1,num2);
                    break;
                case 3:
                    multiplicacion(num1,num2);
                    break;
                case 4:
                    division(num1,num2);
                    break;
                default:
                    System.out.println("operacion ingresada no es válida");
            }

            System.out.println("Desea realizar otra operación\n1.Si\n2.No");
            continuar = lector.nextInt();

        }while(continuar==1);

        lector.close();
    }


    public static int validarNumero(){
        int n=0;
        System.out.println("Ingresa dos números");
        do{
            System.out.println("número:");
            while (!lector.hasNextInt()) {
                System.out.println("Ingrese un número entero positivo");
                lector.next(); // Limpiar el buffer de entrada
            }
            n = lector.nextInt();
            if(n<=0){
                System.out.println("Debe ingresar un número mayor que 0");
            }
        }while(n<=0);
        return n;
    }

    public static void suma(int a, int b){
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public static void resta(int a, int b){
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public static void multiplicacion(int a, int b){
        System.out.println(a + " x " + b + " = " + (a * b));
    }

    public static void division (int a, int b){
        System.out.println(a + " / " + b + " = " + (a / b));
    }


}
