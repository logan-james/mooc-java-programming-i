
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int totalYears = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            // Making input into array, splitting input where comma is.
            String[] inputParts = input.split(",");
            // Storing index 0 element in String variable name.
            String name = parts[0];
            // Storing index 1 element in int variable by changing value of.
            int birthYear = Integer.valueOf(inputParts[1]);

            // If the length of name is longer than longestName store longestName as name.
            if (name.length() > longestName.length()) {
                longestName = name;
            }

            totalYears += birthYear;
            count++;
        }

        double average = (double) totalYears / count;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
