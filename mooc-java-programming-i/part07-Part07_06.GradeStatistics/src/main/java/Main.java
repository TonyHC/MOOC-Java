
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeStatistics gradeStat = new GradeStatistics();
        
        UserInterface ui = new UserInterface(scanner, gradeStat);
        ui.start();
    }
}
