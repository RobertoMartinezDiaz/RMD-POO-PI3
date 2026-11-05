package Ejercicio1;

public class Main1 {
    public static void main(String[] args) {
        Ejercicio2.Figura rectangulo = new Ejercicio2.Rectangulo(5.0, 3.0);
        Ejercicio2.Figura triangulo = new Ejercicio2.Triangulo(4.0, 6.0);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}
