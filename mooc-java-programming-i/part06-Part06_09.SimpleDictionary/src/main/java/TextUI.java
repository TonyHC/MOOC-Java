
import java.util.Scanner;


public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    
    public TextUI(Scanner mScanner, SimpleDictionary mSimpleDictionary) {
        this.scanner = mScanner;
        this.simpleDictionary = mSimpleDictionary;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if(command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if(command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
               
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                
                this.simpleDictionary.add(word, translation);
            } else if(command.equals("search")) {
                System.out.print("To be translated: ");
                String translatedWord = scanner.nextLine();
                
                if(this.simpleDictionary.translate(translatedWord) == null) {
                    System.out.println("Word " + translatedWord + " was not found");
                    continue;
                }
                
                System.out.print("Translation: " + this.simpleDictionary.translate(translatedWord) + "\n");
            } else {
                System.out.println("Unknown command");      
            }
        }
    }
}
