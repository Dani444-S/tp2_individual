package ar.unju.escmi.tp2.ejercicio12;

import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {
        // Para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int edad;

        // Para solicitar las 5 edades
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            edad = scanner.nextInt();

            // Para Verificar el rango de edad
            if (edad >= 1 && edad <= 12) {
                System.out.println("Es un niño");
            } else if (edad >= 13 && edad <= 20) {
                System.out.println("Es un joven");
            } else if (edad >= 21 && edad <= 100) {
                System.out.println("Es un adulto");
            } else {
                System.out.println("Edad no permitida");
            }
        }
        scanner.close();
    }
}