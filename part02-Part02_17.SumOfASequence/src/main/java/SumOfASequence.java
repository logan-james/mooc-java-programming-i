
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number? ");
        int input = Integer.valueOf(scanner.nextLine());
        int sum = 0;

        int i = 0;
        while (i < input) {
            i++;
            sum = sum + i;
        }

        System.out.println("The sum is " + sum);
    }
}
