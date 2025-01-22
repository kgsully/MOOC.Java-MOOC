
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Bird> birdList;

    public UserInterface(Scanner scanner, ArrayList<Bird> birdList) {
        this.scanner = scanner;
        this.birdList = birdList;
    }

    public void start() {

        while(true) {
            System.out.print("? ");
            String input = this.scanner.nextLine();
            if (input.equals("Quit")) {
                break;
            }

            if (input.equals("Add")) {
                System.out.print("Name: ");
                String newName = this.scanner.nextLine();
                Bird foundBird = null;
                for (Bird bird : birdList) {
                    if (bird.getName().equals(newName)) {
                        foundBird = bird;
                    }
                }
                if (foundBird == null) {
                    System.out.print("Name in Latin: ");
                    String newLatinName = this.scanner.nextLine();
                    this.birdList.add(new Bird(newName, newLatinName));
                } else {
                    System.out.println("Bird already exists!");
                }
            }
            if (input.equals("Observation")){
                System.out.print("Bird? ");
                String searchBird = this.scanner.nextLine();
                Bird obsBird = null;
                for (Bird bird : birdList) {
                    if (bird.getName().equals(searchBird)) {
                        obsBird = bird;
                    }
                }
                if (obsBird == null) {
                    System.out.println("Not a bird!");
                } else {
                    obsBird.addObservation();
                }
            }
            if (input.equals("All")) {
                for (Bird bird : birdList) {
                    System.out.println(bird);
                }
            }
            if (input.equals("One")) {
                System.out.print("Bird? ");
                String oneBird = this.scanner.nextLine();
                for (Bird bird : birdList) {
                    if (bird.getName().equals(oneBird)) {
                        System.out.println(bird);
                        break;
                    }
                }

            }
        }

    }

}
