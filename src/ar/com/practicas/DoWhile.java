package ar.com.practicas;

public class DoWhile {

    public static void main(String[] args) {

        //Contador de ovejas
        int contador = 1;
        //Ejecuta primero
        do{
            System.out.println("Ovejas " + contador);
            contador++;
        }while( contador < 4); //Evalua despues
        System.out.println("Dormido...");
    }
}
