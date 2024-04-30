
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int third = Integer.valueOf(scanner.nextLine());

        double avg = (1.0 * first + second + third) / 3;

        System.out.println("The average is " + avg);
    }
}
/*
 * Note -- if multiplying or type casting is done first then
 * the integer will take an integer.
 * Example:
 * int dividend = 3;
 * int divisor = 2;
 * double result = dividend / divisor * 1.0;
 * system.out.println(result) // answer = 1.0
 * answer is 1 and not 1.5 because 3/2 was executed first
 */