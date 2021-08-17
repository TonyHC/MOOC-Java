package RecipeSearch;

import java.util.ArrayList;

public class RecipeList {
    private ArrayList<Recipe> recipes;

    public RecipeList() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public ArrayList<Recipe> getRecipes() {
        return this.recipes;
    }

    public void findRecipesByName(String recipeName) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(recipeName))
                System.out.println(recipe);
        }
    }

    public void findRecipesByCookingTime(int maxCookingTime) {
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxCookingTime)
                System.out.println(recipe);
        }
    }

    public void findRecipesByCookingIngredients(String ingredient) {
        for (Recipe recipe : recipes) {
            for (int i = 0; i < recipe.getIngredients().size(); i++) {
                if (ingredient.toLowerCase().equals(recipe.getIngredients().get(i)))
                    System.out.println(recipe);
            }
        }
    }

    public void printAllRecipes() {
        for (Recipe recipe : recipes)
            System.out.println(recipe);
    }
}
