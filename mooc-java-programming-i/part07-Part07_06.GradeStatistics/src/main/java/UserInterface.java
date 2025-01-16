
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Grades grades;

    public UserInterface(Scanner scanner, Grades grades) {
        this.scanner = scanner;
        this.grades = grades;
    }

    public void start() {

        System.out.println("Enter point totals, -1 stops:");

        while(true) {
            int input = Integer.valueOf(this.scanner.nextLine());

            if (input == -1) {
                break;
            }

            this.grades.add(input);
        }
    }
}
