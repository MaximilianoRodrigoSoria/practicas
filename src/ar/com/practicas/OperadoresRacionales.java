package ar.com.practicas;

public class OperadoresRacionales {

    public static void main(String[] args) {

        int varA = 10;
        int varB = 21;

        //Operador ==  --> A == B --> verdadero/falso
        System.out.println( varA == varB);

        //Operador ! =  --> A == B --> verdadero/falso
        System.out.println( varA != varB);

        //Operador AND --> && --> A == 10 && B == 20 --> true
        System.out.println( varA==10 && varB==20);

        //Operador OR  --> || --> (A == 10 || B==20) --> true
        System.out.println( varA==110 || varB==20);

        //Negar una condicion !
        //Operador AND NOT --> && --> A == 10 && B == 20 --> true
        System.out.println( varA==10 && !(varB==20));

        //--> Ejecutar como tarea
    }
}
