
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner uiScanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(uiScanner);

        String fileName = ui.getFileName();
        FileInterface fi = new FileInterface(fileName);
        RecipeList recipeList = fi.readRecipeFile();

        ui.start(recipeList);


    }

}
