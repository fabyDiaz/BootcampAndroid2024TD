public class Clase17 {

    public static void main(String[] args) {
          /*
    Consigna:
    1. Declarar una varibale de tipo char llamada "identificador" y asígnale el dígito verififcado de tu RUT. Imprime esta varibale
     */

        System.out.println("EJERCICIO 1:");
        char identificador = 0;
        System.out.println("el digito identificador es "+identificador);

        /*
        2. Crea una varibale de tipo boolean llamda "estudiante" y asíganle true si
        eres estudiante, false en caso contrario. Imprime esta variable.
         */

        boolean estudiante = true;
        System.out.println("Es estudiante "+estudiante);

        /*
        3. Declara una variable String "apellido" y asíganales tu apellido. Imprime esta
         variabla concatenada con tu nombre
         */
        String apellido = "Díaz";
        System.out.println("Fabiola "+apellido);

        System.out.println("\n==============================");
        System.out.println("EJERCICIO 2");

        byte numbyte = 35;
        short numshort = 1234;
        int numint = 12343346;
        long numlong = 123382573;

        System.out.println("byte: " + numbyte + "\n"+
                            "short: " + numshort + "\n"+
                            "int: " + numint + "\n"+
                            "long: " + numlong + "\n");

        float numfloat = 0.765f;
        double numdouble = 78383.9459;
        System.out.println("float: " + numfloat);
        System.out.println("double: " + numdouble);

    }


}
