package Ejercicio2;

public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método abstracto
    public abstract double calcularSalario();

    // Método concreto para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Salario Total: $" + calcularSalario());
    }
}
