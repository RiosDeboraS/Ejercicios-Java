import java.util.Scanner; // importamos clase scanner para usar el objeto
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Por favor, ingresa tu nombre: ");


        String name = scanner.nextLine();


        System.out.println("¡Hola, " + name + "! Bienvenido.");


        scanner.close();
    }



}