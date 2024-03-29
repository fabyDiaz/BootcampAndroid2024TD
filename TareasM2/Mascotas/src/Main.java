public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Ayudante de Santa", "Galgo", 3, "mediano");
        Persona persona1 = new Persona("Bart","Simpson", 10, 123456789, perro1);
        Perro perro2 = new Perro("Snoopy", "beagle", 4, "mediano");
        Persona persona2 = new Persona("Charly", "Brown", 8, 789654123, perro2);

        System.out.println(persona1);
        System.out.println(persona2);
    }
}