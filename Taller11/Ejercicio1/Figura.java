package Ejercicio1;

public abstract class Figura {

    // Método abstracto que debe ser implementado por las subclases
    public abstract double calcularArea();

    // Método concreto que muestra el área calculada
    public void mostrarArea() {
        System.out.println("El área es: " + calcularArea());
    }
}