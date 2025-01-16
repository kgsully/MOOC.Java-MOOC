
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grades grades = new Grades();
        UserInterface userInterface = new UserInterface(scanner, grades);

        // Write your program here -- consider breaking the program into
        // multiple classes.

        // Start user interface to poll for input
        userInterface.start();

        // Print average of all grades
        System.out.println("Point average (all): " + grades.getAverageAll());

        // Print average of passing grades. If no passing grades, print '-'
        System.out.print("Point average (passing): ");
        if (grades.getAveragePassing() == -1) {
            System.out.println("-");
        } else {
            System.out.println(grades.getAveragePassing());
        }

        // Print passing percentage
        System.out.println("Pass percentage: " + grades.getPassingPercentage());

        // Print grade distribution
        System.out.println(grades.getGradeDistribution());

    }
}
