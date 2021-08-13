
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String phrase = scanner.nextLine();
            
            if(phrase.equals("")) {
                break;
            }
            
            String[] phrases = phrase.split(" ");
            
            System.out.println(phrases[0]);
        }
    }
}
