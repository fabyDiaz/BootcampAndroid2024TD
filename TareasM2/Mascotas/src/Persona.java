public class Persona {
    private String  nombrePersona;
    private String apellidoPersona;
    private int edadPersona;
    private int rutPersona;

    private Perro perro;

    public Persona(String nombrePersona, String apellidoPersona, int edadPersona, int rutPersona, Perro perro) {
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.edadPersona = edadPersona;
        this.rutPersona = rutPersona;
        this.perro = perro;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    public int getRutPersona() {
        return rutPersona;
    }

    public void setRutPersona(int rutPersona) {
        this.rutPersona = rutPersona;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombrePersona='" + nombrePersona + '\'' +
                ", apellidoPersona='" + apellidoPersona + '\'' +
                ", edadPersona=" + edadPersona +
                ", rutPersona=" + rutPersona +
                ", perro=" + perro +
                '}';
    }
}
