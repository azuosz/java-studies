import java.util.Scanner;
import java.util.Locale;

public class uri1008 {

        public static void main(String[] args) {

                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

                int numero = sc.nextInt();
                int horas = sc.nextInt();
                double valorHora = sc.nextDouble();

                double salario = valorHora * horas;

                System.out.println("NUMBER = " + numero);
                System.out.printf("SALARY = U$ %.2f%n", salario);



        }

}
