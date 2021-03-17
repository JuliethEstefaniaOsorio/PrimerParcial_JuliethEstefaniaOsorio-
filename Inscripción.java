import java.util.Scanner;

public class Inscripción {
    private final Scanner scanner = new Scanner(System.in);

    public Avion inscribirAvion() {
        System.out.println("Ingresa la información del Avion");
        Vehiculo vehiculo = inscribirVehiculo();
        System.out.println("Ingresa la altura máxima");
        double alturaMaxima = scanner.nextDouble();
        return new Avion(vehiculo, alturaMaxima);

    }

    public Yate inscribirYate() {
        System.out.println("Ingresa la información del Yate");
        Vehiculo vehiculo = inscribirVehiculo();
        System.out.println("Ingresa Peso máximo");
        double pesoMaximo = scanner.nextDouble();
        return new Yate(vehiculo, pesoMaximo);
    }

    public Carro inscribirCarro() {
        System.out.println("Ingresa la información del Carro");
        Vehiculo vehiculo = inscribirVehiculo();
        System.out.println("Ingresa el número de puertas");
        int numeroPuertas = scanner.nextInt();
        return new Carro(vehiculo, numeroPuertas);
    }

    public Vehiculo inscribirVehiculo() {
        System.out.println("Ingresa la referencia");
        String referencia = scanner.nextLine();
        System.out.println("Ingresa el color");
        String color = scanner.nextLine();
        System.out.println("ingresa la velocidad máxima");
        String velocidadMaxima = scanner.nextLine();
        return new Vehiculo(referencia, color, velocidadMaxima);
    }

}
