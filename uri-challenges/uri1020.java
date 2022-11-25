import java.util.Scanner;

public class uri1020 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                int idadeEmDias, anos, meses, dias, resto;

                idadeEmDias = sc.nextInt();

                anos = idadeEmDias / 365;
                resto = idadeEmDias % 365;
                meses = resto / 30;
                dias = resto % 30;

                System.out.println(anos + " ano(s)");
                System.out.println(meses + " mes(es)");
                System.out.println(dias + " dia(s)");

                sc.close();
        }
}
