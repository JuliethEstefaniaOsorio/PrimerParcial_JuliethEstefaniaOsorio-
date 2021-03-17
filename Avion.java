public class Avion extends Vehiculo {
    private final double alturaMaxima;

    public Avion(String color, String referencia, String velocidadMaxima, double alturaMaxima) {
        super(color, referencia, velocidadMaxima);
        this.alturaMaxima = alturaMaxima;
    }

    public Avion(Vehiculo vehiculo, double alturaMaxima) {
        super(vehiculo);
        this.alturaMaxima = alturaMaxima;
    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAltura máxima: " + alturaMaxima;
    }
}
