package ar.unju.escmi.tp2.ejercicio10;

public class ejercicio10 {
     public static void main(String[] args) {
        int a = 7, b = 5, c = -14;
        System.out.println("a=" + a + " b=" + b + " c=" + c);
        System.out.println("a>3 ? " + (a > 3));
        System.out.println("a>c ? " + (a > c));
        System.out.println("a<c ? " + (a < c));
        System.out.println("b<c ? " + (b < c));
        System.out.println("b!=c ? " + (b != c));
        System.out.println("a==3 ? " + (a == 3));
        System.out.println("a*b==15 ? " + (a + b == 15));
        System.out.println("a*b==-30 ? " + (a * b == -30));
        System.out.println("c/b<4 ? " + ((double)c / (double)b < (double)a));
        System.out.println("c/b==-10 ? " + ((double)c / (double)b == -10));
        System.out.println("c/b==-4 ? " + (c / b == -4));
        System.out.println("a+b+c==5 ? " + (a + b + c == 5));
        System.out.println("(a+b==8) && (a-b==2) ? " + ((a + b == 8) && (a - b == 2)));
        System.out.println("(a+b==8) || (a-b==6) ? " + ((a + b == 8) || (a - b == 6)));
        System.out.println("a>3 && b>3 && c<3 ? " + (a > 3 && b > 3 && c < 3));
        System.out.println("a>3 && b>=3 && c<-3 ? " + (a > 3 && b >= 3 && c < -3));
    }
}
