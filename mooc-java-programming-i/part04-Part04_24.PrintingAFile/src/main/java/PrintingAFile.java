
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(Paths.get("data.txt"))) {
            while(scanner.hasNextLine()) {
                String text = scanner.nextLine();
                System.out.println(text);
            }
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
