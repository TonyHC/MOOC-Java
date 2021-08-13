
import java.util.Scanner;


public class UserInterface {
    private Scanner scanner;
    private TodoList toDoList;
    
    public UserInterface(TodoList toDoList, Scanner scanner) {
        this.scanner = scanner;
        this.toDoList = toDoList;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
           
            if(command.equals("stop")) {
                break;
            }
            
            if(command.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                this.toDoList.add(task);
            } else if(command.equals("list")) {
                this.toDoList.print();
            } else if(command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int removeTask = Integer.parseInt(scanner.nextLine());
                this.toDoList.remove(removeTask);
            }
        }
    }
}
