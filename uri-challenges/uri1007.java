import java.util.Scanner;
import java.util.Locale;

public class uri1007 {

        public static void main(String[] args) {

                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();

                int diferenca = a * b - c * d;

                System.out.printf("DIFERENCA = %d%n", diferenca );


        }

}
