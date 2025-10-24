package ar.unju.escmi.tp2.ejercicio5;

public class ejercicio5 {
    public static void main(String[] args) {
        int a = 8, b = 3, c = -5;
        int r1 = a + b + c;
        int r2 = 2 * b + 3 * (a - c);
        float r3 = (float) a / b;
        int r4= a % b; 
        float r5= (float) a / c;
        int r6 = a % c; 
        float r7 = (float) a * b / c;   
        float r8 = a * ((float) b / c); 
        int r9 = (a * c) % b;
        int aux=(c % b); if(aux<0)  aux=1;  
        int r10 = a * aux; 
        int r11 = (3 * a - 2 * b) % (2 * a - c);  
        float r12 = 2 * ((float) a / 5 + (4 - b * 3)) % (a + c - 2);   
        float r13 = (float) (a - 3 * b) % (c + 2 * a) / (a - c); 
        int r14 = a - b - c * 2;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
        System.out.println(r7);
        System.out.println(r8);
        System.out.println(r9);
        System.out.println(r10);
        System.out.println(r11);
        System.out.println(r12);
        System.out.println(r13);
        System.out.println(r14);
    }
}
