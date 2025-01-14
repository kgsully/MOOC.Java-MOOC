import java.util.ArrayList;

public class Room {

    private ArrayList<Person> people;

    public Room() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public boolean isEmpty() {
        return this.people.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return people;
    }

    public Person shortest() {
        if (isEmpty()) {
            return null;
        }

        Person shortest = people.get(0);
        for (Person person : people) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take() {
        if (isEmpty()) {
            return null;
        }

        Person shortest = shortest();
        people.remove(shortest);
        return shortest;
    }
}
