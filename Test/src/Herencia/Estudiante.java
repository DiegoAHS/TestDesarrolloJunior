package Herencia;

public class Estudiante extends Persona{
    private String carrera;
    private int matricula;

    public Estudiante(String nombre, int edad, String carrera, int matricula) {
        super(nombre, edad);
        this.carrera = carrera;
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carrera='" + carrera + '\'' +
                ", matricula=" + matricula +
                "," + super.toString() +
                '}';
    }
}
