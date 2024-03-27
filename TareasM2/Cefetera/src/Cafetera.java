public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        this.capacidadMaxima=1000;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    //su fucnión es hacer que la cantidad actual sea igual a la capacidad máxima
    public void llenarCafetera(){
        this.cantidadActual=this.capacidadMaxima;
        System.out.println("Cafetera llena");
    }

    //Llena la taza, si no alcanza a llenarla, informa lo que falta.
    public void servirTaza(int taza){
        int resto;
        if(this.cantidadActual<taza){
            resto = taza-this.cantidadActual;
            System.out.println("No hay cantidad suficiente para llenar la taza");
            System.out.println("Falta: "+resto +"cc");
            this.cantidadActual=0;
        }else{
            System.out.println("Se llenó la taza");
            this.cantidadActual-=taza;
        }
    }

    //Define la cantidad de café en cero;
    public void vaciarCafetera(){
        this.cantidadActual=0;
        System.out.println("Cafetera vacía");
    }

    //Se pide una cantidad de café, y añade a la cafetera la cantidad de café indicada
    public void agregarCafe(int cantCafe){
        this.cantidadActual += cantCafe;
        System.out.println("La cantidad actual es: " + cantidadActual);
    }

}
