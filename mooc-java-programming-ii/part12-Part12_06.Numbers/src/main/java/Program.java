
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        UserInterface userInterface = new UserInterface(scanner, random);
        userInterface.start();
    }
}
