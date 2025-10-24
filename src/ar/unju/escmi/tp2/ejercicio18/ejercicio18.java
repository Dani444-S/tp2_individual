package ar.unju.escmi.tp2.ejercicio18;

public class ejercicio18 {
    public static void main(String[] args) {
        Integer num1 = 1000;
        Integer num2 = 1000;

        System.out.println("Referencia num1: " + System.identityHashCode(num1));
        System.out.println("Referencia num2: " + System.identityHashCode(num2));

        if (num1 == num2)
            System.out.println("Las referencias son iguales");
        else
            System.out.println("Las referencias No son iguales");

        if (num1.equals(num2))
            System.out.println("Los valores son iguales");
        else
            System.out.println("Los valores No son iguales");
    }
}