import java.util.Scanner;


public class tarea4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Seleccione una opción: ");


        int opcion = scanner.nextInt();


        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();


        double resultado = 0;
        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");

                    return;
                }
                break;
            default:
                System.out.println("Opción no válida.");

                return;
        }


        System.out.println("El resultado de la operación seleccionada es: " + resultado);


        scanner.close();
    }
}
