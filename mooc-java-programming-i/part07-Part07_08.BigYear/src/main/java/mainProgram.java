
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BirdWatchers birdWatcher = new BirdWatchers();
        
        UserInterface ui = new UserInterface(scan, birdWatcher);
        ui.start();
    }
}
