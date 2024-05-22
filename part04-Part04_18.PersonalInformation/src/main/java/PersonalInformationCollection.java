
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("First name: ");
            String fName = scanner.nextLine();
            if (fName.isEmpty()) {
                break;
            }
            System.out.print("Last name: ");
            String lName = scanner.nextLine();
            System.out.print("Identification number: ");
            String idNumber = scanner.nextLine();

            // Create a new PersonalInformation object and add it to the list
            PersonalInformation personalInfo = new PersonalInformation(fName, lName, idNumber);
            infoCollection.add(personalInfo);

        }
        System.out.println("");
        for (PersonalInformation info : infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
    }
}
