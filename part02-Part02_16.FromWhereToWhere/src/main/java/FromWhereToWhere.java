
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int inputTo = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int inputFrom = Integer.valueOf(scanner.nextLine());

        for (int i = inputFrom; i <= inputTo; i++) {
            System.out.println(i);
        }
    }
}
