import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);;

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double triangulo = A * C / 2;
        double circulo = 3.14159 * Math.pow(C, 2);
        double trapezio = (A + B) * C / 2;
        double quadrado = B * B;
        double retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);


    }

}
