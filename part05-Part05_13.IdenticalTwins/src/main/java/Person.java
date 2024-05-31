
import java.util.Objects;

import javax.swing.SortingFocusTraversalPolicy;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared) {

        // same memory reference
        if (this == compared) {
            return true;
        }

        // same type
        if (!(compared instanceof Person)) {
            return false;
        }

        // type casting - convert type
        Person comparedPerson = (Person) compared;

        // compare variables
        if (this.name.equals(comparedPerson.name) &&
                this.birthday.equals(comparedPerson.birthday) &&
                // int 'primitive' types dont need equals method bc not references
                this.height == comparedPerson.height &&
                this.weight == comparedPerson.weight) {
            return true;
        }

        // other wise return false if these conditions dont result in true
        return false;
    }
}
