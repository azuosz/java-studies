import java.util.Locale;
import java.util.Scanner;


public class uri1006 {

        public static void main(String[] args) {

                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

                double a, b, c, media;

                a = sc.nextDouble() * 2.0;
                b = sc.nextDouble() * 3.0;
                c = sc.nextDouble() * 5.0;

                media = (a + b + c) / 10.0;

                System.out.printf("MEDIA = %.1f%n", media);

                sc.close();
        }
}
