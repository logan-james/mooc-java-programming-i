
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack s = new Stack();
        System.out.println(s.isEmpty()); // true
        System.out.println(s.values()); // []
        s.add("Value");
        System.out.println(s.isEmpty()); // false
        System.out.println(s.values()); // [Value]
    }
}
