
import java.util.Scanner;


public class tarea5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese un número del 1 al 7 para conocer el nombre del día de la semana: ");
        int numero = scanner.nextInt();


        if (numero >= 1 && numero <= 7) {

            String nombreDia = obtenerNombreDia(numero);


            System.out.println("El día correspondiente al número " + numero + " es: " + nombreDia);
        } else {
            System.out.println("Número no válido. Debe ser un número del 1 al 7.");
        }


        scanner.close();
    }


    public static String obtenerNombreDia(int numero) {
        String nombreDia;
        switch (numero) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Desconocido";
                break;
        }
        return nombreDia;
    }
}
