
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here

        // Test code - Parts 1 & 2
        // Person anna = new Person("Anna", Education.PHD);
        // System.out.println(anna);

        // Test code - Parts 3 & 4
        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));

        university.print();

        university.fire(Education.HS);

        System.out.println("==");

        university.print();
    }
}
