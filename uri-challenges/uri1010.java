import java.util.Locale;
import java.util.Scanner;

public class uri1010 {

        public static void main(String[] args) {

                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

                int cod1, cod2, uni1, uni2;
                double valor1, valor2;

                cod1 = sc.nextInt();
                uni1 = sc.nextInt();
                valor1 = sc.nextDouble();
                cod2 = sc.nextInt();
                uni2 = sc.nextInt();
                valor2 = sc.nextDouble();

                double valoraPagar = valor1 * uni1 + valor2 * uni2;

                System.out.printf("VALOR A PAGAR: R$ %.2f%n", valoraPagar);



        }

}
