package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        try {
            if (name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty");
            }
            if (name.length() > 40) {
                throw new IllegalArgumentException("Name must be 40 characters or less");
            }

            this.name = name;


            if (age < 0 || age > 120) {
                throw new IllegalArgumentException("Age must be between 0 and 120");
            }
            this.age = age;

        } catch (Exception e) {
            throw new IllegalArgumentException("Name cannot be Null");
        }

        // From Solution:
        // if (name == null || name.isEmpty() || name.length() > 40) {
        //     throw new IllegalArgumentException("The name of the person cannot be empty "
        //             + "and it should be max. 40 characters.");
        // }

        // if (age < 0 || age > 120) {
        //     throw new IllegalArgumentException("The age of a person should be between [0-120].");
        // }

        // this.name = name;
        // this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
