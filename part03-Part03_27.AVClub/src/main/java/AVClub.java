
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] inputIntoArrayParts = input.split(" ");
            for (String part : inputIntoArrayParts) {
                if (part.contains("av")) {
                    System.out.println(part);
                }
            }
        }
        // String input = scanner.nextLine();
        // String[] parts = input.split(" ");
        // for (String i : parts) {
        // if (i.contains("av")) {
        // System.out.println(i);
        // } else {
        // break;
        // }

        // }

    }
}
