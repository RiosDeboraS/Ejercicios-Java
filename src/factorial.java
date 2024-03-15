
import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        // Calculando Factorial
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número para calcular el factorial:");
        int numeroPasado = scanner.nextInt();
        long inicializarFactorial = 1;

        for (int i = 1; i <= numeroPasado; i++) {
            inicializarFactorial *= i;
        }

        System.out.println("El factorial de " + numeroPasado + " es: " + inicializarFactorial);
    }
}
