import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());

            TelevisionProgram tele = new TelevisionProgram(name, duration);
            programs.add(tele);
        }

        System.out.print("Program's maximum duration? ");
        int maxTime = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram show : programs) {
            if (show.getDuration() <= maxTime) {
                System.out.println(show);
            }
        }
    }
}
