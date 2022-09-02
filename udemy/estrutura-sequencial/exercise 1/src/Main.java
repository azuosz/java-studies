import java.util.Scanner;
import java.util.Locale;


public class Main {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      double largura;
      double comprimento;
      double valorDoMetro;
      double area;
      double preco;

      System.out.print("Digite a largura do terreno: ");
      largura = sc.nextDouble();
      System.out.print("Agora digite o comprimento: ");
      comprimento = sc.nextDouble();
      System.out.print("Agora digite o valor do metro quadrado: ");
      valorDoMetro = sc.nextDouble();

      area = largura * comprimento;
      preco = valorDoMetro * area;

      Locale.setDefault(Locale.US);
      System.out.printf("Area: %.2f%n", area);
      System.out.printf("Preco: %.2f%n", preco);

      sc.close();



    }
}
