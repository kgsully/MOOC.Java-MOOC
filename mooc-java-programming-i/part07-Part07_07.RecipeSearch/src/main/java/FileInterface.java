
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class FileInterface {

    private String fileName;
    private RecipeList recipeList;

    public FileInterface(String fileName) {
        this.fileName = fileName;
        this.recipeList = new RecipeList();
    }

    public RecipeList readRecipeFile() {
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while(fileScanner.hasNextLine()) {
                // Scan name
                String name = fileScanner.nextLine();

                // Scan cook time
                int cookTime = Integer.valueOf(fileScanner.nextLine());

                // Loop to scan ingredients - scan and add to recipe ingredients list UNTIL scanner encounters an empty line
                ArrayList<String> ingredients = new ArrayList<>();
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    if (line.isEmpty()) {
                        break;
                    }
                    ingredients.add(line);
                }

                // Add new recipe to recipe list
                this.recipeList.addRecipe(new Recipe(name, cookTime, ingredients));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return recipeList;
    }

}
