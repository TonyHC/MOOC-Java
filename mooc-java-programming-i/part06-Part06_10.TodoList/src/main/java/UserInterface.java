
import java.util.Scanner;


public class UserInterface {
    private TodoList toDoList;
    private Scanner scanner;
    
    public UserInterface(TodoList mToDoList, Scanner mScanner) {
        this.toDoList = mToDoList;
        this.scanner = mScanner;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if(command.equals("stop")) {
                break;
            } else if(command.equals("add")) {
                System.out.print("To add: ");
                String addToList = scanner.nextLine();
                this.toDoList.add(addToList);
            } else if(command.equals("list")) {
                this.toDoList.print();
            } else if(command.equals("remove")) {
                System.out.print("Which one is removed? ");
                Integer indexToRemove = Integer.valueOf(scanner.nextLine());
                this.toDoList.remove(indexToRemove);
            }
        }
    }
}
