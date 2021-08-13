
import java.nio.file.Paths;
import java.util.Scanner;


public class UserInterface {
    private Scanner scanner;
    private RecipeInfo recipeInfo;
    
    public UserInterface(Scanner scanner, RecipeInfo recipeInfo) {
        this.scanner = scanner;
        this.recipeInfo = recipeInfo;
    }
    
    public void start() {
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        
        System.out.println("\nCommands:");
        System.out.println("list - lists the recipes\nstop - stops the program");
        System.out.println("find name = searches recipes by name\nfind cooking time = searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        int fileRowNumber = 1;
        String recipeName = "";
        int value = 0;
        String ingredients = "";
        try(Scanner scan = new Scanner(Paths.get(fileName))) {
            while(scan.hasNextLine()) {
                String fileInfo = scan.nextLine();
                //System.out.println(fileInfo);
                
                if(fileRowNumber == 1) {
                    if(fileInfo.contains(" ")) {
                        String[] data = fileInfo.split(" ");
                        String recipeName1 = data[0];
                        String recipeName2 = data[1];
                        recipeName = data[0] + " " + data[1];
                    } else {
                        recipeName = fileInfo;
                    }
                } else if(fileRowNumber == 2) {
                        value = Integer.valueOf(fileInfo);
                } else if(fileRowNumber > 2){
                    if(fileInfo.contains(" ")) {
                        String[] data = fileInfo.split(" ");
                        String ingredients1 = data[0];
                        String ingredients2 = data[1];
                        ingredients += ingredients1 + " " + ingredients2 + ",";
                    } else {
                        ingredients += fileInfo + ",";
                    }
                } 
                
                if(fileInfo.trim().length() == 0) {
                    //System.out.println("Blank");
                    fileRowNumber = 1;
                    this.recipeInfo.add(recipeName, value, ingredients);
                    ingredients = "";
                    continue;
                }
                
                fileRowNumber++;
            }
            
            //System.out.println("Outside");
            this.recipeInfo.add(recipeName, value, ingredients);
            
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        while(true) {
            System.out.println("");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")) {
                break;
            }
            
            if(command.equals("list")) {
                System.out.println("\nRecipes:");
                recipeInfo.printAllRecipeNameAndCookingTime();
            } else if(command.equals("find name")) {
                System.out.print("\nSearched word: ");
                String word = scanner.nextLine();
                System.out.println("\nRecipes:");
                recipeInfo.findRecipesByName(word);
            } else if(command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println("\nRecipes:");
                recipeInfo.findRecipesByCookingTime(maxCookingTime);
            } else if(command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("\nRecipes:");
                recipeInfo.findRecipesByIngredient(ingredient);
            }
        }
    }
}
