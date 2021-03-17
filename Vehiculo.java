public class Vehiculo {
    private final String referencia;
    private final String color;
    private final String velocidadMaxima;

    public Vehiculo(String referencia, String color, String velocidadMaxima) {
        this.referencia = referencia;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
    }

    public Vehiculo(Vehiculo vehiculo) {
        this.referencia = vehiculo.getReferencia();
        this.color = vehiculo.getColor();
        this.velocidadMaxima = vehiculo.getVelocidadMaxima();
    }

    public String getReferencia() {
        return referencia;
    }

    public String getColor() {
        return color;
    }

    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }

    @Override
    public String toString() {
        return "\nReferencia: " + referencia + "\nColor: " + color + "\nVelocidad máxima: " + velocidadMaxima;
    }
}
