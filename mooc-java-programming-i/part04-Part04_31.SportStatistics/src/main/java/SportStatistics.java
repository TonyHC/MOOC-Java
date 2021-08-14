import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Game game = new Game();
        FileReader fileReader = new FileReader();
        Scanner scanner = new Scanner(System.in);

        UserInput userInput = new UserInput(game, fileReader, scanner);
        userInput.run();
    }
}
