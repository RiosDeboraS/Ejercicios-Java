
import java.util.Scanner;

public class tareaBucles {
    public static void main(String[] args) {
        // Código para la tabla del 7
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 * " + i + " = " + (i * 7));
        }

        // Bucle while para calcular la suma de los números pares del 1 al 20
        int numero = 1;
        int pares = 0;
        while (numero <= 20) {
            if (numero % 2 == 0) {
                pares += numero;
            }
            numero++;
        }

        System.out.println("El resultado es: " + pares);


        // Código para el juego de adivinar el número secreto
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 10;
        int intentos = 3;

        System.out.println("Bienvenido al juego de adivinar el número secreto.");
        System.out.println("Tienes 3 intentos para adivinar el número secreto.");

        do {
            System.out.println("Ingresa tu intento:");
            int intento = scanner.nextInt();
            if (intento == numeroSecreto) {
                System.out.println("¡Felicidades! ¡Lo adivinaste!");
                return;
            } else {
                System.out.println("Fallaste, sigue intentando.");
                intentos--;
                System.out.println("Te quedan " + intentos + " intentos.");
            }
        } while (intentos > 0);

        System.out.println("Lo siento, has agotado tus intentos.");
        System.out.println("El número secreto era: " + numeroSecreto);


    }
}





