public class Clase21 {

    public static void main(String[] args) {

        /*
           ITERANDO
           Mostrar la suma del 1 al 10 con WHILE - DO WHILE - FOR*

         */
        int i;
        int suma;

        System.out.println("Suma del 1 al 10 con WHILE");
        i=1;
        suma=0;
        while (i<=10){
            suma+=i;
            i++;
        }
        System.out.println("La suma con WHILE es "+suma);

        System.out.println("\n================================");
        System.out.println("Suma del 1 al 10 con DO-WHILE");
        i=1;
        suma=0;
        do{
            suma+=i;
            i++;
        }while(i<=10);
        System.out.println("La suma con Do-WHILE es "+suma);

        System.out.println("\n================================");
        System.out.println("Suma del 1 al 10 con FOR");
        suma=0;
        for(i =1; i<=10; i++){
            suma+=i;
        }
        System.out.println("La suma con FOR es "+suma);
    }
}
