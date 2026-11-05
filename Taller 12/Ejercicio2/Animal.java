package Ejercicio2;

public class Animal implements Volador, Nadador {
    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    @Override
    public void volar() {
        System.out.println("El " + especie + " despliega sus alas y vuela.");
    }

    @Override
    public void nadar() {
        System.out.println("El " + especie + " se desliza y nada en el agua.");
    }
}
