package ar.unju.escmi.tp2.ejercicio16;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Ingrese un número entre 5 y 10: ");
            n = scanner.nextInt();
        } while (n < 5 || n > 10);

        String[] nombres = new String[n];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            nombres[i] = scanner.next();
        }

        System.out.println("\nMostrando nombres desde el índice 0:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }

        System.out.println("\nMostrando nombres desde la última posición:");
        for (int i = nombres.length - 1; i >= 0; i--) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }

        scanner.close();
    }
}