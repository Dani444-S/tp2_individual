package ar.unju.escmi.tp2.ejercicio6;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo (byte): ");
        byte radio = sc.nextByte();
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área del círculo es: " + area);
        sc.close();
    }
}