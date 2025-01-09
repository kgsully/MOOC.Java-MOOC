
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                String[] rowParts = row.split(",");
                String name = rowParts[0];
                int age = Integer.valueOf(rowParts[1]);

                System.out.println(name + ", age: " + age + " years");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
