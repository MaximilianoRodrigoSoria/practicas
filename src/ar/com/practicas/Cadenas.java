package ar.com.practicas;

public class Cadenas {

    public static void main(String[] args) {

        String miCadena = "Maximiliano";
        String miCaden2 = "Marcela";
        String miCaden3 = "MAXIMILIANO";
        String apellido = " Perez";
        int edad = 33;

        //Imprime cadena 1
        System.out.println("Nombre: " + miCadena);

        //Comparacion de cadenas
        System.out.println(miCaden3.equals(miCadena));

        //Concatenar cadenas
        System.out.println(miCadena.concat(apellido));

        //Pasar a Mayusculas
        System.out.println(miCaden2.toUpperCase());

        //Pasar a Minusculas
        System.out.println(miCaden2.toLowerCase());

        //Pasar a Minusculas
        System.out.println(miCadena.concat(String.valueOf(edad)));
    }
}
