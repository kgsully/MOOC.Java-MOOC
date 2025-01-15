import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI (Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            processCommand(command);

            }
        }

        // Should these methods be private? Should they be able to be accessed outside the class?
    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("search")) {
            search();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.print("Word: ");
        String word = this.scanner.nextLine();
        System.out.print("Translation: ");
        String translation = this.scanner.nextLine();
        dictionary.add(word, translation);
    }

    public void search() {
        System.out.print("To be translated: ");
        String query = scanner.nextLine();
        String queryTranslation = dictionary.translate(query);

        if (queryTranslation == null) {
            System.out.println("Word " + query + " was not found");
        } else {
            System.out.println("Translation: " + this.dictionary.translate(query));
        }
    }

    }
