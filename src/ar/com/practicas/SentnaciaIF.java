package ar.com.practicas;

public class SentnaciaIF {

    public static void main(String[] args) {

        // Semaforo  --> ROJO / AMARILLO / VERDE

        String semaforo = "ROJO";

        if( semaforo.equals("VERDE")){
                System.out.println("Pasa tranqui!!!");
            }
        else{
            if (semaforo.equals("AMARILLO")){
                System.out.println("Tene cuidado!!!");
            } else
            {
                System.out.println("No pasar!!!");
            }
        }



    }
}
