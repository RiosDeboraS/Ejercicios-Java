
import java.util.Scanner;

public class tare3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();


        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();


        if (numero1 > numero2) {
            System.out.println("El primer número (" + numero1 + ") es mayor que el segundo número (" + numero2 + ").");
        } else if (numero1 < numero2) {
            System.out.println("El segundo número (" + numero2 + ") es mayor que el primer número (" + numero1 + ").");
        } else {
            System.out.println("Los dos números son iguales.");
        }


        scanner.close();
    }
}
