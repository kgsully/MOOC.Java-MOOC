
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            System.out.print("> ");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (amount < 0) {
                continue;
            }

            if (command.equals("add")){
                first = first + amount > 100 ? 100 : first + amount;
            }
            if (command.equals("move")) {
                amount = first - amount < 0 ? first : amount;
                first = first - amount < 0 ? 0 : first - amount;
                second = second + amount > 100 ? 100 : second + amount;
            }
            if (command.equals("remove")) {
                second = second - amount < 0 ? 0 : second - amount;
            }

        }
    }

}
