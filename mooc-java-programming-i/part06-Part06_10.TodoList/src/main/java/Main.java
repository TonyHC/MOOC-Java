
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        TodoList list = new TodoList();
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");
        list.print();
        list.remove(2);
        list.print();
        list.add("buy rasins");
        list.print();
        list.remove(1);
        list.remove(1);
        list.print();
        
        UserInterface ui = new UserInterface(list, scanner);
        ui.start();
    }
}
