
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numOfnums = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            }

            if (input != 0) {
                sum += input;
                numOfnums++;
            }
        }
        System.out.println("Number of numbers: " + numOfnums);
        System.out.println("Sum of the numbers: " + sum);
    }
}
