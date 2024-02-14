package Abstración;

public class Rectangulo extends FiguraGeometrica{

    private double lado;

    public Rectangulo(double lado) {
        super("Area Rectangulo");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "lado=" + lado +
                '}';
    }
}
