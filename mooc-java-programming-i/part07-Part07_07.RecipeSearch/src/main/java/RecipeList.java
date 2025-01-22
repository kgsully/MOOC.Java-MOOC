
import java.util.ArrayList;

public class RecipeList {

    private ArrayList<Recipe> recipeList;

    public RecipeList() {
        this.recipeList = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipeList.add(recipe);
    }

    public ArrayList<Recipe> getRecipeList() {
        return recipeList;
    }

    public String getRecipes() {
        String recipeListString = "";
        for (Recipe recipe : this.recipeList) {
            recipeListString += recipe.getName() + ", cooking time: " + recipe.getCookTime() + "\n";
        }
        return recipeListString;
    }

    public String findRecipeByName(String name) {
        String recipeString = "";
        for (Recipe recipe : this.recipeList) {
            if (recipe.getName().contains(name)) {
                recipeString += recipe.getName() + ", cooking time: " + recipe.getCookTime() + "\n";
            }
        }

        return recipeString;
    }

    public String findRecipeByCookTime(int time) {
        String recipeString = "";
        for (Recipe recipe : this.recipeList) {
            if (recipe.getCookTime() <= time) {
                recipeString += recipe.getName() + ", cooking time: " + recipe.getCookTime() + "\n";
            }
        }

        return recipeString;
    }

    public String findRecipeByIngredient(String ingredient) {
        String recipeString = "";
        for (Recipe recipe : this.recipeList) {
            if (recipe.getIngredients().contains(ingredient)) {
                recipeString += recipe.getName() + ", cooking time: " + recipe.getCookTime() + "\n";
            }
        }
        return recipeString;
    }
}
