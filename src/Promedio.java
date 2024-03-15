
import java.util.Scanner;


public class Promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumaNotas = 0;
        int cantidadNotas = 0;

        System.out.println("Ingrese sus notas una por una. Cuando haya terminado, ingrese -1 para calcular el promedio.");

        double nota = 0;
        while (nota != -1) {
            System.out.print("Ingrese una nota (-1 para terminar): ");
            nota = scanner.nextDouble();

            if (nota != -1) {
                sumaNotas += nota;
                cantidadNotas++;
            }
        }

        if (cantidadNotas > 0) {
            double promedio = sumaNotas / cantidadNotas;
            System.out.println("El promedio de las notas es: " + promedio);
        } else {
            System.out.println("No se ingresaron notas.");
        }
    }
}
