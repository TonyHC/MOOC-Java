
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookList bookList = new BookList();
        
        UserInterface ui = new UserInterface(scanner, bookList);
        ui.start();
    }
}
