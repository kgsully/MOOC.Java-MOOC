import validating.Person;

public class Main {

    public static void main(String[] args) {
        try {
            Person person = new Person(null, 20);
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }
}
