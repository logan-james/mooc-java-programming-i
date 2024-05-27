
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        // Track if string is found
        boolean found = false;

        // Create a Scanner object to read from the file
        try (Scanner filScanner = new Scanner(Paths.get(file))) {
            // Loop as long as there is another line in the file
            while (filScanner.hasNextLine()) {
                // Read the next line from the file
                String line = filScanner.nextLine();
                // Check if the line contains the searched string
                if (line.contains(searchedFor)) {
                    found = true;
                    // Exit loop since we found the string
                    break;
                }
            }
            // Catch any exceptions that occur while reading the file
        } catch (Exception e) {
            // Print error message
            System.out.println("Reading the file" + file + " failed.");
            // Exit the program
            return;
        }

        if (found) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
