
import java.util.ArrayList;


public class Suitcase {
    private int weightLimit;
    private ArrayList<Item> itemList;
    
    public Suitcase(int limit) {
        this.weightLimit = limit;
        this.itemList = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if(totalWeight() + item.getWeight() <= this.weightLimit) {
            this.itemList.add(item);
        }
    }
    
    public String toString() {
        if(this.itemList.isEmpty()) {
            return "no items (" + totalWeight() + " kg)";
        }
        
        if(this.itemList.size() == 1) {
            return itemList.size() + " item (" + totalWeight() + " kg)";
        }
        
        return itemList.size() + " items (" + totalWeight() + " kg)";
    }
    
    public void printItems() {
        for(Item item : this.itemList) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int sum = 0;
        for(Item item : this.itemList) {
            sum += item.getWeight();
        }
        
        return sum;
    }
    
    public Item heaviestItem() {
        if(itemList.isEmpty()) {
            return null;
        }
        
        Item heaviest = itemList.get(0);
        for(Item item : itemList) {
            if(heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
}
