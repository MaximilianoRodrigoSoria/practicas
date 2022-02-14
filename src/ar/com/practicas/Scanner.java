package ar.com.practicas;

public class Scanner {

    public static void main(String[] args) {

        //Defino mi scaner
        java.util.Scanner consola = new java.util.Scanner(System.in);

        //Mensaje para el usuario:
        System.out.print("Escribe tu nombre: ");
        //Igualo el contenido de lo que escribi a una variable
        String  nombre = consola.nextLine();


        System.out.print("Escribe tu apellido: ");
        String  apellido = consola.nextLine();

        //Imprimo por pantalla
        System.out.println("Usted es "+nombre+" "+apellido);

    }
}
