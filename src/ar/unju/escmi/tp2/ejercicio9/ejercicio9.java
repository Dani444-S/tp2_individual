package ar.unju.escmi.tp2.ejercicio9;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un anio: ");
        String entrada = sc.nextLine().trim();

        try {
            int anio = Integer.parseInt(entrada);

            boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

            if (esBisiesto) {
                System.out.println(anio + " es un anio bisiesto.");
            } else {
                System.out.println(anio + " NO es un anio bisiesto.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida. Debe ser un número entero de anio.");
        } finally {
            sc.close();
        }
    }
}
