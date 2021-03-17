import java.util.Scanner;

public class Principal {
    Scanner scanner = new Scanner(System.in);
    Validación validar = new Validación();

    public void principal() {
        Vehiculo garaje[] = new Vehiculo[10];
        System.out.println("¡¡¡Bienvenido a su Garaje Artemisa!!!\n\t\tSu Garaje Confiable");
        System.out.println("\nSeleccione una opción:\n1.Agrega Vehiculo.\n2.Mostrar Garaje.\n3.Salir.");
        int opcion = validar.menu();
        int aux = 0;
        while (opcion != 3) {
            if (opcion == 1) {
                for (int i = 0; i < garaje.length; i++) {
                    if (garaje[i] == null) {
                        System.out.println("Tienes lugar para guardar tu vehilo");
                        aux = i;
                        break;
                    } else if ((garaje[i] != null) && (i == (garaje.length - 1))) {
                        opcion = 3;
                        System.out.println("lo sentimos, NO puedes guardar tu vehiculo");
                        System.out.println("\nSeleccione una opción:\n2.Mostrar Garaje.\n3.Salir.");
                        opcion = scanner.nextInt();
                    }
                }
            }
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa:\na)Avión.\nb)Yate\nc)Carro.\nd)Salir.");
                    char tipo = scanner.next().charAt(0);
                    switch (tipo) {
                        case 'a':
                            garaje[aux] = new Inscripción().inscribirAvion();
                            break;
                        case 'b':
                            garaje[aux] = new Inscripción().inscribirYate();
                            break;
                        case 'c':
                            garaje[aux] = new Inscripción().inscribirCarro();
                            break;
                        case 'd':
                            break;
                        default:
                            System.out.println("Gracia!!!");
                    }
                    break;
                case 2:
                    System.out.println("Los siguientes son los vehiculos en el garaje:");
                    for (int i = 0; i < garaje.length; i++) {
                        if (garaje[i] == null) {
                            break;
                        }
                        System.out.println(garaje[i]);
                    }
                    break;
                case 3:
                    System.out.println("Gracias por usar nuestros servicios...");
                    opcion = 3;
            }
            System.out.println("\nSeleccione una opción:\n1.Agrega Vehiculo.\n2.Mostrar Garaje.\n3.Salir.");
            opcion = validar.menu();
        }
    }
}
