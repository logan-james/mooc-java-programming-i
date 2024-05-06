
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numberOfInputs = 0;
        double avg = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            } else {
                sum += input;
                numberOfInputs++;
            }
        }

        avg = 1.0 * sum / numberOfInputs;
        System.out.println("Average of the numbers: " + avg);
    }
}
