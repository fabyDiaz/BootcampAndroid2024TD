public class Clase26 {
    public static void main(String[] args) {
        int x = 0;
        depurar(x);
    }

    public static void depurar(int x){
        while (x<1){
            System.out.println("Ciclo");
            x=x+1; //Faltaba actualizar x, de lo contrario el bucle es infinito
        }
    }
}
