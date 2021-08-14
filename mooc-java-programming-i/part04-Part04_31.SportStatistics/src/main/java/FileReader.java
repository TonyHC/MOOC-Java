import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    FileReader() {}

    public ArrayList<Game> readGameData(String filePath) {
        ArrayList<Game> game = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(filePath))) {
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();

                if (data.isEmpty())
                    continue;

                String[] teamData = data.split(",");
                game.add(new Game(teamData[0], teamData[1], Integer.parseInt(teamData[2]), Integer.parseInt(teamData[3])));
            }
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }

        return game;
    }
}
