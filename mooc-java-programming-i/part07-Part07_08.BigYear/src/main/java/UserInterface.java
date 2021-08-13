
import java.util.Scanner;


public class UserInterface {
    private Scanner scanner;
    private BirdWatchers birdWatcher;
    
    public UserInterface(Scanner scanner, BirdWatchers birdWatcher) {
        this.scanner = scanner;
        this.birdWatcher = birdWatcher;
    }
    
    public void start() {
        while(true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            
            if(command.equals("Quit")) {
                break;
            } 
            
            if(command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                this.birdWatcher.add(name, latinName);
            } else if(command.equals("Observation")) {
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                boolean observeBird = this.birdWatcher.observation(bird);
                if(!observeBird)
                    System.out.println("Not a bird!");
            } else if(command.equals("All")) {
                this.birdWatcher.printAllBirds();
            } else if(command.equals("One")) {
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                boolean foundTheBird = this.birdWatcher.findABird(bird);
                if(!foundTheBird)
                    System.out.println("Not a bird!");
            }
        }
    }
}
