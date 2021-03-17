public class Yate extends Vehiculo {
    private final double pesoMaximo;

    public Yate(String color, String referencia, String velocidadMaxima, double pesoMaximo) {
        super(color, referencia, velocidadMaxima);
        this.pesoMaximo = pesoMaximo;
    }

    public Yate(Vehiculo vehiculo, double pesoMaximo) {
        super(vehiculo);
        this.pesoMaximo = pesoMaximo;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPeso máximo: " + pesoMaximo;
    }
}
