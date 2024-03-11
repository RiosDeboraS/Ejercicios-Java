import java.util.Scanner;


public class tarea2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();


        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;


        System.out.println("El área del triángulo con base " + base + " y altura " + altura + " es: " + area);


        scanner.close();
    }
}
