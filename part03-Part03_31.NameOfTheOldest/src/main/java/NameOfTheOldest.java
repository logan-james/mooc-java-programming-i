
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int helper = 0;
        int oldest = 0;
        String nameOfOldest = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split(",");
            helper = Integer.valueOf(parts[1]);

            if (helper > oldest) {
                oldest = helper;
                nameOfOldest = parts[0];
            }

        }
        System.out.println(nameOfOldest);

    }
}
