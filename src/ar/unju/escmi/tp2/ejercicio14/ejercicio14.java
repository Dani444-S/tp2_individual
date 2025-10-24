package ar.unju.escmi.tp2.ejercicio14;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        int[] numeros = new int[8];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa 8 numeros enteros:");
        for (int i = 0; i < numeros.length; i++) {
            while (true) {
                System.out.print("Valor para indice " + i + ": ");
                String entrada = scanner.nextLine().trim();
                try {
                    numeros[i] = Integer.parseInt(entrada);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Proba de nuevo con un entero.");
                }
            }
        }

        System.out.println("\nContenido del array (índice -> valor):");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + " -> " + numeros[i]);
        }

        scanner.close();
    }
}