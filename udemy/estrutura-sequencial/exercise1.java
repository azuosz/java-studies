import java.util.Scanner;
import java.util.Locale;


public class exercise1 {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);



      double valorDoMetro, area, preco;

      System.out.print("Digite a largura do terreno: ");
      double largura = sc.nextDouble();
      System.out.print("Agora digite o comprimento: ");
      double comprimento = sc.nextDouble();
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
