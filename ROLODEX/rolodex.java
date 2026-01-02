import java.util.Scanner;

public class RolodexImporter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce informacion de contacto. Ecribe 'exit' en la parte de Nombre para salir");

        while (true) {
            System.out.print("Nombre entero: ");
            String nombre = scanner.nextLine();
            if (nombre.equals("exit")) {
                System.out.println("Salida de la aplicacion.");
                break;
            }
            if (nombre.isEmpty()) {
                System.out.println("El nombre no puede estar vacio");
                continue;
            }

            System.out.print("Numero de telefono: ");
            String telefono = scanner.nextLine();

            System.out.print("Gmail: ");
            String gmail = scanner.nextLine();

        }
        scanner.close();
    }
}