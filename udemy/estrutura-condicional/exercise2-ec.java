import java.util.Locale;
import java.util.Scanner;

public class exercise2-ec {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.print("Menor = " + a);
        } else if (b < c && b < a) {
            System.out.print("Menor = " + b);
        }
        else {
            System.out.print("Menor = " + c);
        }

        sc.close();

    }

}

