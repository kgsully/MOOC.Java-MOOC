
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> itemList = new ArrayList<>();

        while (true) {

            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isBlank()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isBlank()) {
                break;
            }

            Item newItem = new Item(identifier, name);

            if (!(itemList.contains(newItem))){
                itemList.add(newItem);
            }
        }

        System.out.println("==Items==");
        for (Item item : itemList) {
            System.out.println(item);
        }
    }
}
