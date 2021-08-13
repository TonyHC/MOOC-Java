
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userInput = new ArrayList<>();
        
        while(true) {
            String input = scanner.nextLine();
            if(input.isEmpty()) {
                break;
            }
            
            userInput.add(input);
        }
        
        userInput.stream().forEach(input -> System.out.println(input));
    }
}
