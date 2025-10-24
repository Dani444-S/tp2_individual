package ar.unju.escmi.tp2.ejercicio15;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n=0;
        do{
            System.out.println("Ingrese un numero entero entre 3 y 10: ");
            n = scanner.nextInt();
        } while(n<3 || n>10);

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            System.out.println("Ingrese un valor: ");
            int val = scanner.nextInt();
            arr[i] = val;
        }
        scanner.close();

        int suma=0;
        for(int i=0; i<n; i++){
            System.out.println("Posicion: " + i + ", Valor: " + arr[i]);
            suma+=arr[i];
        }
        System.out.println("La suma de todos los valores del array es "+suma);

    }
}