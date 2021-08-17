package RecipeSearch;

import java.nio.file.Paths;
import java.util.Scanner;

public class File {

    public File() {

    }

    public void readFile(RecipeList recipeList, String fileName) {
        String file = "C:\\Users\\TonyC\\Desktop\\JetBrainsAcademy\\Numeric Matrix Processor\\task\\src\\RecipeSearch\\";

        // Use the File class instead of Paths.get() -> File file = new File(fileName)
        try (Scanner scan = new Scanner(Paths.get(file + fileName))) {
            while (scan.hasNextLine()) {
                String recipeName = scan.nextLine();
                int cookingTime = Integer.parseInt(scan.nextLine());
                Recipe recipe = new Recipe(recipeName, cookingTime);
                recipeList.addRecipe(recipe);

                while (scan.hasNextLine()) {
                    String ingredient = scan.nextLine();

                    if (ingredient.isEmpty())
                        break;

                    recipe.addIngredient(ingredient);
                }
            }
        } catch (Exception exception) {
            System.out.println("Exception: " + exception);
        }
    }
}
