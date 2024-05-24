
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String stringInput = scanner.nextLine();
            if (stringInput.equals("end")) {
                break;
            }
            int intInput = Integer.valueOf(stringInput);
            System.out.println(intInput * intInput * intInput);
        }
    }
}
