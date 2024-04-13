public class ProcedimientoArreglado {

    public static void main(String[] args) {

        String frutas[]={"Manzanas", "Peras", "Uvas", "Naranjas", "Melón", "Plátanos"};
        MostrarValoresArreglo(frutas);

    }

    public static void MostrarValoresArreglo(String[]arreglo){
        for (int i =0; i< arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
    }
}
