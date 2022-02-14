package ar.com.practicas;

public class Swich {

    public static void main(String[] args) {

        int nota = 4;
        String  estado = "Consultar legajo de alumno";

        switch(nota){
            case 1: case 2: case 3:
                estado = "esta desaprobado";
                break;
            case 4: case 5: case 6:
                estado = "va a final";
                break;
            case 7: case 8: case 9:
                estado = "esta aprobado";
                break;
            case 10:
                estado = "esta aprobado con la nota mas alta";
                break;
        }
        System.out.println("Estado del alumno " + estado);

    }
}
