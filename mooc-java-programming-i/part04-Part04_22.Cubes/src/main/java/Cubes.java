
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String entry = scanner.nextLine();
            if (entry.equals("end")) {
                break;
            }

            int entryVal = Integer.valueOf(entry);
            System.out.println((int) Math.pow(entryVal, 3));

        }
    }
}
