package RecipeSearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RecipeList recipeList = new RecipeList();
        Scanner scanner = new Scanner(System.in);
        File file = new File();

        UserInterface ui = new UserInterface(recipeList, scanner, file);
        ui.start();
    }
}
