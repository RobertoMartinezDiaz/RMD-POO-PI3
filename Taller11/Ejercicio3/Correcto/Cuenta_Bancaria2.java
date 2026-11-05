package Ejercicio3.Correcto;

public abstract class Cuenta_Bancaria2 {
    protected String titular;

    public Cuenta_Bancaria2(String titular) {
        this.titular = titular;
    }

    // MAL USO: Se define como método concreto, pero lógicamente debería ser obligatorio sobrescribirlo
    public void calcularInteres() {
        System.out.println("Calculando interés estándar...");
    }
}
