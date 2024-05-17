
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        int helper = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");

            oldest = Integer.valueOf(parts[1]);

            if (oldest > helper) {
                helper = oldest;
            }
        }
        System.out.println("Age of the oldest " + helper);
    }
}
