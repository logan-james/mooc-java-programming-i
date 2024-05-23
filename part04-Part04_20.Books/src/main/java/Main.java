import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a new ArrayList to store the various info on a certain book
        ArrayList<Book> booksArrayList = new ArrayList<>();

        // Read book information from the user
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());

            // Create a new Book object and add it to the list
            booksArrayList.add(new Book(title, pages, pubYear));
        }
        System.out.println("");

        // Ask user what information to print
        System.out.print("What information will be printed? ");
        String input = scanner.nextLine();

        if (input.equals("everything")) {
            for (Book book : booksArrayList) {
                System.out.println(book.getEverything());
            }
        } else if (input.equals("name")) {
            for (Book book : booksArrayList) {
                System.out.println(book.getTitle());
            }
        }

    }
}
