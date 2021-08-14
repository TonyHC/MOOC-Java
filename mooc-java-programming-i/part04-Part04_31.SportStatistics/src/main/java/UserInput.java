import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    private Game game;
    private FileReader fileReader;
    private Scanner scanner;

    public UserInput(Game game, FileReader fileReader, Scanner scanner) {
        this.game = game;
        this.fileReader = fileReader;
        this.scanner = scanner;
    }

    public void run() {
        String absolutePath = "C:\\Users\\TonyC\\Desktop\\JetBrainsAcademy\\Numeric Matrix Processor\\task\\src\\processor\\";
        String fileName = "data.csv";

        ArrayList<Game> games = fileReader.readGameData(absolutePath + fileName);

        String teamName = scanner.nextLine().toUpperCase();
        System.out.println("\nFile: " + fileName + "\nTeam: " + teamName);

        int gamesPlayed = game.gamesPlayed(games, teamName);
        int gamesWon = game.gamesWon(games, teamName);

        System.out.println("Games: " + gamesPlayed + "\nWins: " + gamesWon + "\nLosses: " + (gamesPlayed - gamesWon));
    }
}
