
import java.util.ArrayList;


public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> list;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.list = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        if(currentWeight() + item.getWeight() <= this.capacity)
            this.list.add(item);
        
        return;
    }

    @Override
    public boolean isInBox(Item item) {
        return this.list.contains(item);
    }
    
    private int currentWeight() {
        int currentWeight = 0;
        for(Item item : list) {
            currentWeight += item.getWeight();
        }
        
        return currentWeight;
    }
}
