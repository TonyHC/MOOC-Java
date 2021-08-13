
import java.util.ArrayList;


public class Box implements Packable {
    private ArrayList<Packable> boxList;
    private double capacity;
    
    public Box(double capacity) {
        this.boxList = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public void add(Packable packableItem) {
        if(weight() + packableItem.weight() > this.capacity) 
            return;
        
        this.boxList.add(packableItem);
    }
    
    @Override
    public double weight() {
        double currentWeight = 0.0;
        if(this.boxList.isEmpty())
            return currentWeight;
        
        
        for(Packable packableItem : this.boxList) {
            currentWeight += packableItem.weight();
        }
        
        return currentWeight;
    }
    
    @Override
    public String toString() {
        return "Box: " + boxList.size() + " items, total weight " + weight() + " kg";
    }
    
}