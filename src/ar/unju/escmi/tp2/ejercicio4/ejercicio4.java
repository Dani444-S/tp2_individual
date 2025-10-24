package ar.unju.escmi.tp2.ejercicio4;

public class ejercicio4 {
    public static void main(String[] args) {
        int num = 3;

        long triangular = (long) num * (num + 1) / 2;
        long resultadoConPow = (long) Math.pow(triangular, 2);

        // Alternativa exacta sin pow (opcional, para comparar)

        System.out.println("num = " + num);
        System.out.println("Triangular = " + triangular);
        System.out.println("Resultado de (num * (num + 1) / 2)^2 = " + resultadoConPow);
    }
}
