package Abstración;

public class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo(double radio) {
        super("Area del circulo");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (radio*radio);
    }

}
