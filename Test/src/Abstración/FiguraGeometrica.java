package Abstración;

public abstract class FiguraGeometrica {
    private String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularArea();

    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
