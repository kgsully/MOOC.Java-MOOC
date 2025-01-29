
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> numbers = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" top stop");
        while (true) {
            String input = scanner.nextLine();
            if (input.toLowerCase().equals("end")) {
                break;
            }

            numbers.add(input);
        }

        System.out.println("\nPrint the average of the negative numbers or the positive numbers? (n/p)");
        String nOrP = scanner.nextLine();

        if (nOrP.toLowerCase().equals("p")) {
            double average = numbers.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(s -> s > 0)
            .average()
            .getAsDouble();

            System.out.println("Average of the positive numbers: " + average);
        } else {
            double average = numbers.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(s -> s < 0)
            .average()
            .getAsDouble();

            System.out.println("Average of the negative numbers: " + average);
        }
    }
}
