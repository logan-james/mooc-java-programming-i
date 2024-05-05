
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negNums = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            } else if (input < 0) {
                negNums++;
                continue;
            }
        }
        System.out.println("Number of negative numbers: " + negNums);
    }
}
