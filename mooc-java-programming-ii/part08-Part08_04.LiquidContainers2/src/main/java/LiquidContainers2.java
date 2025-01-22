
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            // Print container status with each loop iteration as well as command carrat
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
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

            // Process commands
            if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("move")) {
                // if amount in first container < amount to move, can only move what is in 1st container
                if (first.contains() < amount) {
                    second.add(first.contains());
                } else {
                    second.add(amount);
                }
                first.remove(amount);
            } else if (command.equals("remove")) {
                second.remove(amount);
            } else {
                System.out.println("Command not recognized");
            }

            System.out.println("");
        }
    }

}
