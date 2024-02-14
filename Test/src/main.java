import Abstración.Circulo;
import Abstración.FiguraGeometrica;
import Herencia.Estudiante;

public class main {
    public static void main(String[] args) {

        // Extender
        Estudiante estudiante = new Estudiante("Maria", 22, "Ingeniería", 12345);
        System.out.println(estudiante);

        // Abstracción
        FiguraGeometrica figura1 = new Circulo(5);
        System.out.println(figura1.calcularArea());

        // Ejercicios de excepciones y finobacci
        Fibonacci();
        excepcion(1,0);



    }

    public static void Fibonacci(){
        int n = 10;
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void excepcion(int num1, int num2){
        try {
            int resultado = num1 / num2;
            System.out.println(resultado);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
