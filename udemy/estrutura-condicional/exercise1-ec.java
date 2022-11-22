import java.util.Locale;
import java.util.Scanner;

public class exercise1-ec {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        double nota1, nota2, soma;

        System.out.print("Digite sua primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        nota2 = sc.nextDouble();

        soma = nota1 + nota2;
        System.out.printf("Nota final %.1f%n", soma);

        if (soma >= 60) {
            System.out.print("APROVADO!");
        }
        else {
            System.out.print("REPROVADO");
        }

        sc.close();

    }

}

