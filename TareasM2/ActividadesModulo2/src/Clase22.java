import java.util.Locale;
import java.util.Scanner;

public class Clase22 {
    public static void main(String[] args) {

        /*Crea un arreglo para almacenar tres números
         * reales ingresados por el usuario y mostrar el mayor elemento*/

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double numerosReales[]=new double[3];
        double mayor;

        System.out.println("Ingrese 3 números reales: ");

        for(int i =0; i<3; i++ ){
            while (!scanner.hasNextDouble()) {
                System.out.println("Entrada no válida. Intente nuevamente (ingrese el número con un punto): ");
                scanner.next();
            }
            numerosReales[i]=scanner.nextDouble();
        }
        mayor=numerosReales[0];
        for(int i =0; i<3; i++){
            if(numerosReales[i]>mayor){
                mayor=numerosReales[i];
            }
        }
        System.out.println("El número mayor es: "+mayor);
    }
}
