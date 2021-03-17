import java.util.InputMismatchException;
import java.util.Scanner;

public class Validación {
    Scanner scanner = new Scanner(System.in);

    public int menu() {
        int opcion = 0;
        try {
            opcion = scanner.nextInt();
            scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("La opción ingresada no es valida");
        }
        return opcion;
    }
}
