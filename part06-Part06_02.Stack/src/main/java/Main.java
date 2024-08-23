
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack s = new Stack();
        System.out.println(s.isEmpty()); // true
        System.out.println(s.values()); // []
        s.add("Value");
        System.out.println(s.isEmpty()); // false
        System.out.println(s.values()); // [Value]
        String taken = s.take();
        System.out.println(s.isEmpty()); // true
        System.out.println(s.values()); // []
        System.out.println(taken); // Value

        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");
        //--- delete ---
        s.add("6")
        // ----------
        System.out.println(s.take());
        while (!s.isEmpty()) {
        }

    }
}
