package ar.com.practicas;

public class While {
    public static void main(String[] args) {

        int contador = 1;
        while( contador < 4) //Evalua primero y ejecuta despues
            {
            System.out.println("Ovejas " + contador);
            contador++;
        }
        System.out.println("Dormido...");
    }
}
