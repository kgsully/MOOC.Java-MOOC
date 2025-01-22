
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private RecipeList recipeList;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    // Get file name for read
    public String getFileName() {
        System.out.print("File to read: ");
        String fileName = this.scanner.nextLine();
        return fileName;
    }

    public void start(RecipeList recipeList) {

        this.recipeList = recipeList;

        System.out.println("\nCommands:\n" +
                           "list - lists the recipes\n" +
                           "stop - stops the program\n" +
                           "find name - searches recipes by name\n" +
                           "find cooking time - searches recipes by cooking time\n" +
                           "find ingredient - searches recipes by ingredient\n");

        while(true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }

            this.handleCommand(command);
        }
    }

    public void handleCommand(String command) {
        if (command.equals("list")) {
            System.out.println("\nRecipes:");
            System.out.println(this.recipeList.getRecipes());
        }

        if (command.equals("find name")) {
            System.out.print("Searched word: ");
            String searchedWord = scanner.nextLine();
            System.out.println("\nRecipes:");
            System.out.println(this.recipeList.findRecipeByName(searchedWord));
        }

        if (command.equals("find cooking time")) {
            System.out.print("Max cooking time: ");
            int maxCookTime = Integer.valueOf(scanner.nextLine());
            System.out.println("\nRecipes:");
            System.out.println(this.recipeList.findRecipeByCookTime(maxCookTime));
        }

        if (command.equals("find ingredient")) {
            System.out.print("Ingredient: ");
            String ingredient = scanner.nextLine();
            System.out.println("\nRecipes:");
            System.out.println(this.recipeList.findRecipeByIngredient(ingredient));
        }
    }
}
