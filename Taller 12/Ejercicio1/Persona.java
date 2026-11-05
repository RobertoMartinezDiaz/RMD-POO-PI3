package Ejercicio1;

public class Persona implements Hablador, Trabajador {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void hablar() {
        System.out.println(nombre + " está conversando y exponiendo sus ideas.");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está cumpliendo con sus labores de desarrollo.");
    }
}
