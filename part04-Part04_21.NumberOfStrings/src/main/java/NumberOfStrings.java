
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stringCount = 0;

        while (true) {
            String stringInput = scanner.nextLine();
            if (stringInput.equals("end")) {
                break;
            }
            stringCount++;
        }
        System.out.println(stringCount);
    }
}
