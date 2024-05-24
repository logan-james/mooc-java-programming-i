
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileInput = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();

        // implement reading the file here.
        // Code here
        // try-with-resources statement ensures the Scanner object is closed
        // automatically after block executed
        try (Scanner fileScanner = new Scanner(Paths.get(fileInput))) {
            // Loop as long as there is another line in the file
            while (fileScanner.hasNextLine()) {
                // Read the next line from the file, trim any leading/trailing whitespace
                String name = fileScanner.nextLine().trim();
                // Add the name to the guest list
                list.add(name);
            }
            // Catch any exceptions that occur while reading the file
        } catch (Exception e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        System.out.println("");

        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }
        System.out.println("Thank you!");
    }
}
