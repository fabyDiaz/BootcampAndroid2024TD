import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CuentaBancaria {

    private int numeroDeCuenta;
    private String titular;

    private double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroDeCuenta, String titular, double saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void MostrarDatosCuenta(){
        System.out.println("Cuenta: "+ this.numeroDeCuenta);
        System.out.println("Títular: "+ this.titular);
        System.out.println("Saldo: "+ FormaterSaldo(this.saldo));
    }

    public void ingresarDinero(double dinero){

        this.saldo=this.saldo+dinero;
    }

    public void restarSaldo(double dinero){
        this.saldo=this.saldo-dinero;
    }


    public String FormaterSaldo(double monto) {
        // Crear un formato para pesos chilenos
        NumberFormat formatoPesosChilenos = DecimalFormat.getCurrencyInstance(new Locale("es", "CL"));

        // Formatear el número en pesos chilenos
        String montoFormateado = formatoPesosChilenos.format(monto);

        // Mostrar el resultado
        return montoFormateado;

    }
}
