import java.util.Random;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Random random;

    public UserInterface(Scanner scanner, Random random) {
        this.scanner = scanner;
        this.random = random;
    }

    public void start() {
        System.out.println("How many random numbers should be printed?");
        int num =  Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < num; i++) {
            System.out.println(random.nextInt(11));
        }
    }
}
