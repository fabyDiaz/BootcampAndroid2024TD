import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion, taza, cafe;
        int continuar=1;

        Cafetera cafetera = new Cafetera();


        do{
            System.out.println("Ingrese una opción");
            System.out.println("    1. Llenar cafetera");
            System.out.println("    2.Servir Taza");
            System.out.println("    3.Vaciar Cafetera");
            System.out.println("    4.Agregar Café");
            opcion=scanner.nextInt();

            switch (opcion){
                case 1:
                    cafetera.llenarCafetera();
                    break;
                case 2:
                    System.out.println("Ingrese el tamaño de la taza");
                    taza=scanner.nextInt();
                    cafetera.servirTaza(taza);
                    break;
                case 3:
                    cafetera.vaciarCafetera();
                    break;
                case 4:
                    System.out.println("La cantidad de café es: "+cafetera.getCantidadActual());
                    System.out.println("Ingrese la cantidad de café");
                    cafe = scanner.nextInt();
                    cafetera.agregarCafe(cafe);
                    break;
                default:
                    System.out.println("operacion ingresada no es válida");
                    break;
            }

            System.out.println("Desea realizar otra operación\n1.Si\n2.No");
            continuar = scanner.nextInt();

        }while(continuar==1);

        scanner.close();

    }
}