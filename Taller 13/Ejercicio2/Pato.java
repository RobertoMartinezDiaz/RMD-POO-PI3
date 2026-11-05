package Ejercicio2;

public class Pato implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El pato está volando bajo el cielo.");
    }

    @Override
    public void nadar() {
        System.out.println("El pato está nadando en el lago.");
    }
}
