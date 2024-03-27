public class cafetera {

    private int cantidadActual;
    private int capacidadMaxima;

    public cafetera() {
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    @Override
    public String toString() {
        return "cafetera{" +
                "cantidadActual=" + cantidadActual +
                ", capacidadMaxima=" + capacidadMaxima +
                '}';
    }
}
