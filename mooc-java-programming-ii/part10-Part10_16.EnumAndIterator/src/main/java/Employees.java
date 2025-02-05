
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Employees {

    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        this.employees.addAll(peopleToAdd);
    }

    public void print() {
        Iterator<Person> employeeIterator = this.employees.iterator();

        while (employeeIterator.hasNext()) {
            System.out.println(employeeIterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> employeeIterator = this.employees.iterator();

        while (employeeIterator.hasNext()) {
            Person employee = employeeIterator.next();
            if (employee.getEducation() == education) {
                System.out.println(employee);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> employeeIterator = this.employees.iterator();

        while (employeeIterator.hasNext()) {
            Person employee = employeeIterator.next();
            if (employee.getEducation() == education) {
                employeeIterator.remove();
            }
        }
    }

}
