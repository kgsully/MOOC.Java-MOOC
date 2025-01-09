
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entryCount = 0;

        while (true) {
            String entry = scanner.nextLine();
            if (entry.equals("end")) {
                break;
            }

            entryCount += 1;
        }
        System.out.println(entryCount);
    }
}
