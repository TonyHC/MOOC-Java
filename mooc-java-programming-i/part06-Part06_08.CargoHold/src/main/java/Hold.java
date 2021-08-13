
import java.util.ArrayList;


public class Hold {
    private int currentWeight;
    private int maxWeightLimit;
    private ArrayList<Suitcase> suitcaseList;
    
    public Hold(int limit) {
        this.maxWeightLimit = limit;
        this.suitcaseList = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(this.currentWeight + suitcase.totalWeight() <= this.maxWeightLimit) {
            this.currentWeight += suitcase.totalWeight();
            suitcaseList.add(suitcase);
        }
    }
    
    public String toString() {
        return suitcaseList.size() + " suitcases (" + this.currentWeight + " kg)";
    }
    
    public void printItems() {
        for(Suitcase suitcase : suitcaseList) {
            suitcase.printItems();
        }
    }
}
