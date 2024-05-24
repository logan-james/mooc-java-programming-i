
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {

        // Create a scanner for reading the file
        // try block of code for 'trying to read the file'
        try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {

            // Read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();

                // we print the line that we read
                System.out.println(row);
            }
            // catching the errors
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
