
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int product = 1;

        System.out.print("Give a number: ");
        int input = Integer.valueOf(scanner.nextLine());

        for (int i = 1; i <= input; i++) {
            product *= i;
        }

        System.out.println("Factorial: " + product);
    }
}
