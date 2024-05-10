
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        // Math.max is build in java function which compares two numbers
        // the first Math.max finds the greater of num1 or num2
        // second Math.max finds the greater of the results from first to num3
        return Math.max(Math.max(number1, number2), number3);

        // ------------ Alternative solution with conditionals ------------
        /*
         * int greatest = number1;
         * if (number2 > greatest) {
         * greatest = number2;
         * }
         * if (number3 > greatest) {
         * greatest = number3;
         * }
         * return greatest;
         */
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
