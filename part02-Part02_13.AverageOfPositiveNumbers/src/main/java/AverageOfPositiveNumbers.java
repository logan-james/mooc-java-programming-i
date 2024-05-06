
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double avg = 0;
        int sum = 0;
        int numberOfInputs = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0 && sum == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (input == 0) {
                break;
            }

            if (input > 0) {
                sum += input;
                numberOfInputs++;
                continue;
            }
        }

        avg = 1.0 * sum / numberOfInputs;

        System.out.println(avg);
    }
}
