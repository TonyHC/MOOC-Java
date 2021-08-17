package RecipeSearch;

import java.util.Scanner;

public class UserInterface {
    private RecipeList recipeList;
    private Scanner scanner;
    private File file;

    public UserInterface(RecipeList recipeList, Scanner scanner, File file) {
        this.recipeList = recipeList;
        this.scanner = scanner;
        this.file = file;
    }

    public void start() {
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        file.readFile(recipeList, fileName);

        System.out.println("\nCommands:\n" +
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();

            if (command.toLowerCase().equals("stop"))
                break;

            recipeCommands(command);
        }
    }

    public void recipeCommands(String command) {
        switch (command) {
            case "list" -> {
                System.out.println("\nRecipes:");
                recipeList.printAllRecipes();
            }
            case "find name" -> {
                System.out.print("Searched word: ");
                String recipeName = scanner.nextLine();
                System.out.println("\nRecipes:");
                recipeList.findRecipesByName(recipeName);
            }
            case "find cooking time" -> {
                System.out.print("Max cooking time: ");
                int cookingTime = Integer.parseInt(scanner.nextLine());
                System.out.println("\nRecipes:");
                recipeList.findRecipesByCookingTime(cookingTime);
            }
            case "find ingredient" -> {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("\nRecipes:");
                recipeList.findRecipesByCookingIngredients(ingredient);
            }
            default -> System.out.println("Invalid Command");
        }
    }
}
