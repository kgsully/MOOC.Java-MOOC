
import java.util.Scanner;

public class UserInterface {

    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();

            if (command.equals("X")) {
                break;
            }

            processCommand(command);

        }

    }

    public void processCommand(String command) {
        if (command.equals("1")) {
            add();
        } else if (command.equals("2")) {
            draw();
        } else if (command.equals("3")) {
            list();
        } else {
            System.out.println("Unrecognized command");
        }

    }

    public void add() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        this.jokeManager.addJoke(joke);

    }

    public void draw() {
        System.out.println(this.jokeManager.drawJoke());
    }

    public void list() {
        this.jokeManager.printJokes();
    }

}
