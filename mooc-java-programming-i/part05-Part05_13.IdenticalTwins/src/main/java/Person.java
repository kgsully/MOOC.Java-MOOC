
import java.util.Objects;

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
    public boolean equals (Object compared) {
        // Check memory location reference
        if (this == compared) {
            return true;
        }

        // Check that compared object is an instance of the same class
        if (!(compared instanceof Person)) {
            return false;
        }

        // Cast generic object parameter to Person class
        Person comparedPerson = (Person) compared;

        // Compare all fields for equality
        if (
            this.name.equals(comparedPerson.name) &&
            this.birthday.equals(comparedPerson.birthday) &&
            this.height == comparedPerson.height &&
            this.weight == comparedPerson.weight) {
                return true;
            }

        // Not equal if field equality checks do not pass
        return false;
    }
}
