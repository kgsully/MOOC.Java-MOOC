
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            // Print container status with each loop iteration as well as command carrat
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second+ "/100");
            System.out.print("> ");

            // Poll for user input. Exit loop upon receiving the 'quit' command
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            // Split input into command and amount
            String[] cmdParts = input.split(" ");
            String command = cmdParts[0];
            int amount = Integer.valueOf(cmdParts[1]);

            // Ignore negative values
            if (amount < 0) {
                System.out.println("");
                continue;
            }

            // Process commands
            if (command.equals("add")) {
                first += amount;
            } else if (command.equals("move")) {
                // if amount in first container < amount to move, can only move what is in 1st container
                if (first < amount) {
                    second += first;
                } else {
                    second += amount;
                }
                first -= amount;
            } else if (command.equals("remove")) {
                second -= amount;
            } else {
                System.out.println("Command not recognized");
            }

            // Container can only hold between 0 and 100. If < 0, set to 0, if > 100, set to 100
            if (first > 100) {
                first = 100;
            }
            if (first < 0) {
                first = 0;
            }
            if (second > 100) {
                second = 100;
            }
            if (second < 0) {
                second = 0;
            }

            System.out.println("");
        }
    }

}
