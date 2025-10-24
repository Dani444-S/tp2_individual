package ar.unju.escmi.tp2.ejercicio20;

public class ejercicio20 {
    public static void main(String[] args) {
        String textoOriginal = "Humano";
        String textoModificado = textoOriginal.replace("el", "la");

        System.out.println("textoOriginal = " + textoOriginal);
        System.out.println("textoModificado = " + textoModificado);

        System.out.println("\n------------------");
        System.out.println("Los objetos String en Java son inmutables (no se pueden modificar).");
        System.out.println("El método replace() devuelve un nuevo String sin cambiar el original.");
    }
}