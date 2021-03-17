public class Carro extends Vehiculo {
    private final int numeroPuertas;

    public Carro(String color, String referencia, String velocidadMaxima, int numeroPuertas) {
        super(color, referencia, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    public Carro(Vehiculo vehiculo, int numeroPuertas) {
        super(vehiculo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero de puertas: " + numeroPuertas;
    }
}
