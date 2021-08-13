
import java.util.Scanner;


public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;
    
    public UserInterface(JokeManager mJokeManager, Scanner mScanner) {
        this.jokeManager = mJokeManager;
        this.scanner = mScanner;
    }
    
    public void start() {
        while(true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke \n2 - draw a joke \n3 - list jokes \nX - stop");
            String command = scanner.nextLine();
            
            if(command.equals("X")) {
                break;
            }
            
            if(command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String jokeToBeAdded = scanner.nextLine();
                this.jokeManager.addJoke(jokeToBeAdded);
            } else if(command.equals("2")) {
                System.out.println(this.jokeManager.drawJoke());
            } else if(command.equals("3")) {
                this.jokeManager.printJokes();
            }
        }
    }
}
