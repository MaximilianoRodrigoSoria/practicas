package ar.com.practicas;

public class Operadores {

    public static void main(String[] args) {
        int numeroA = 3;
        int numeroB = 2;

        //Sumar uso el operador +   --> A + B = C
        int resultado = numeroA + numeroB;
        System.out.println("resultado suma = " + resultado);

        //Resta usar el operador -  --> A - B = C
        int resultado2 = numeroA - numeroB;
        System.out.println("resultado resta = " + resultado2);

        //Multiplicacion se usa el operador * --> A * B = C
        int resultado3 = numeroA * numeroB;
        System.out.println("resultado multiplicacion = " + resultado3);

        //Divicion Operador / -->  A / B = C
        double resultado4 = 3D / numeroB;
        System.out.println("resultado division = " + resultado4);

        //Modulo Operador %  --> A / B = C
        int resultado5 = numeroA % numeroB;
        System.out.println("resultado modulo = " + resultado5);

        if( 54 % 2 == 0) {
            System.out.println("Es numero par"); }
        else{
            System.out.println("Es numero impar"); }
    }


    }



