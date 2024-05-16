
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String userName = scanner.nextLine();
        System.out.print("Enter password: ");
        String pw = scanner.nextLine();

        if (userName.equals("alex") && pw.equals("sunshine")) {
            System.out.println("You have successfully logged in!");
        } else if (userName.equals("emma") && pw.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        } else if (userName.equals("alex") && pw.equals("thunderstorm")) {
            System.out.println("You have successfully logged in!");
        }
    }
}
