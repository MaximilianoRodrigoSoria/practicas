package ar.com.practicas;

public class Varibles {

    public static void main(String[] args) {

        //byte: Es la unidad numérica más pequeña en Java y te aparta 1 byte en la memoria del programa. El número almacenado en la variable byte debe ir de -128 a 127.
        byte myByte = 0;
        //short: Otra unidad numérica, esta vez un poco más grande que byte. Almacena un valor de -32768 a 32767 con un gasto de memoria de 2 bytes.
        short myShort = 32767;
        //int: El entero es una unidad que almacena números al igual que los anteriores y puede almacenar hasta 2*109 , con un gasto de memoria de 4 bytes.
        int myInt = 10;
        //long: El long es mucho más grande que los anteriores y ocupa 8 bytes. Igualmente se usa para almacenar datos numéricos.
        long myLong = 10;
        //float: Esta variable es usada para almacenar en ella decimales simples y ocupa 4 bytes de memoria.
        float myFloat = 10.00f;
        //double: El double es especialmente para decimales dobles y ocupa 8 bytes.
        double myDouble = 10.00d;
        //char: Variable que almacena un carácter simple y ocupa 2 bytes.
        char myChar = 'A';
        //boolean: Esta variable es muy diferente a las anteriores, ya que en este caso solo almacena dos tipos de datos, los cuales pueden ser “true” o “false”.
        boolean myBoolean = true;
        //String: Almacena una cadena de caracteres
        String myString = "Hola mundo";

        System.out.println("Resultado: " +myInt);
    }
}
