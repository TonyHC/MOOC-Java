
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> list;
    
    public Stack() {
        this.list = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public void add(String value) {
        list.add(value);
    }
    
    public ArrayList<String> values() {
        return list;
    }
    
    public String take() {
        int size = list.size() - 1;
        String topMostValue = list.get(size);
        list.remove(topMostValue);
        return topMostValue;
    }
}
