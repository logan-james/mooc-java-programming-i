
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileNameScanner = scanner.nextLine();

        try (Scanner scanner2 = new Scanner(Paths.get(fileNameScanner))) {

            while (scanner2.hasNextLine()) {
                String line = scanner2.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                System.out.println(parts[0] + ", age: " + parts[1] + " years");
            }
        } catch (Exception e) {
            System.out.println("Error");
            return;
        }
    }
}
