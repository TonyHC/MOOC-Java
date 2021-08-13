
import java.util.ArrayList;


public class TodoList {
    private ArrayList<String> toDoList;

    public TodoList() {
        this.toDoList = new ArrayList<String>();
    }
    
    public void add(String task) {
        this.toDoList.add(task);
    }
    
    public void print() {
        int index = 1;
        for(String string : this.toDoList) {
            System.out.println(index + ": " + string);
            index++;
        }
    }
    
    public void remove(int number) {
        this.toDoList.remove(number - 1);
    }
}
