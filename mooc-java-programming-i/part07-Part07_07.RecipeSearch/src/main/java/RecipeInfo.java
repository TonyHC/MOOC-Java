
import java.util.ArrayList;


public class RecipeInfo {
    private ArrayList<String> ingredientsList;
    private ArrayList<String> recipeNameList;
    private ArrayList<Integer> cookingTimeList;
    
    public RecipeInfo() {
        this.recipeNameList = new ArrayList<>();
        this.cookingTimeList = new ArrayList<>();
        this.ingredientsList = new ArrayList<>();
    }
    
    public void add(String recipeName, int cookingTime, String ingredients) {
        this.recipeNameList.add(recipeName);
        this.cookingTimeList.add(cookingTime);
        this.ingredientsList.add(ingredients);
    }
    
    public void printAllRecipeNameAndCookingTime() {
        for(int i = 0; i < this.recipeNameList.size(); i++) {
            System.out.println(this.recipeNameList.get(i) + ", cooking time: " + this.cookingTimeList.get(i));
        }
    }
 
    public void findRecipesByCookingTime(int maxCookingTime) {
        for(int i = 0; i < this.cookingTimeList.size(); i++) {
            if(this.cookingTimeList.get(i) <= maxCookingTime) {
                System.out.println(this.recipeNameList.get(i) + ", cooking time: " + this.cookingTimeList.get(i));
            }
        }
    }
    
    public void findRecipesByName(String name) {
        for(int i = 0; i < this.recipeNameList.size(); i++) {
            if(this.recipeNameList.get(i).contains(name)) {
                System.out.println(this.recipeNameList.get(i) + ", cooking time: " + this.cookingTimeList.get(i));
            }
        }
    }
    
    public void findRecipesByIngredient(String ingredient) {
        for(int i = 0; i < this.ingredientsList.size(); i++) {
            String[] ingredients = this.ingredientsList.get(i).split(",");
            for(int j = 0; j < ingredients.length; j++) {
                if(ingredients[j].equals(ingredient)) {
                    System.out.println(this.recipeNameList.get(i) + ", cooking time: " + this.cookingTimeList.get(i));
                }
            }
        }
    }
}
