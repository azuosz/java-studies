import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstArg = scanner.nextInt();

        int secondArg = scanner.nextInt();

        int product = firstArg*secondArg;
        System.out.println("PROD = " + product);

    }
}