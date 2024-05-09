
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Number? ");
        int firstInput = Integer.valueOf(scanner.nextLine());

        System.out.print("Last number? ");
        int lastInput = Integer.valueOf(scanner.nextLine());

        int sum = 0;

        for (int i = firstInput; i <= lastInput; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);
    }
}
