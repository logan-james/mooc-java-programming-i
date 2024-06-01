
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        HashSet<String> identifiers = new HashSet<>();

        while (true) {
            System.out.println("Identifer? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Item item = new Item(identifier, name);
            if (!identifiers.contains(identifier)) {
                items.add(item);
                identifiers.add(identifier);
            }
        }

        System.out.println("==Items==");
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
