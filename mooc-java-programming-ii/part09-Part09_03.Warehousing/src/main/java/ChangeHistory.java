
import java.util.ArrayList;
import java.util.Arrays;


public class ChangeHistory {
    private ArrayList<Double> productHistory;
    
    public ChangeHistory() {
        this.productHistory = new ArrayList<>();
    }
    
    public void add(double status) {
        this.productHistory.add(status);
    }
    
    public void clear() {
        this.productHistory.clear();
    }
    
    public String toString() {
        return productHistory.toString();
    }
    
    public double maxValue() {
        if(!this.productHistory.isEmpty()) {
            double largest = this.productHistory.get(0);
            for(int i = 0; i < this.productHistory.size(); i++) {
                if(largest < productHistory.get(i)) 
                    largest = productHistory.get(i);
            }
            
            return largest;
        }
        
        return 0.0;
    }
    
    public double minValue() {
        if(!this.productHistory.isEmpty()) {
            double smallest = this.productHistory.get(0);
            for(int i = 0; i < this.productHistory.size(); i++) {
                if(smallest > productHistory.get(i))
                    smallest = productHistory.get(i);
            }
            
            return smallest;
        }
        
        return 0.0;
    }
    
    public double average() {
        double sum = 0;
        if(!this.productHistory.isEmpty()) {
            for(double currentHistory : this.productHistory) {
                sum += currentHistory;
            }
            
            return sum / this.productHistory.size();
        }
        
        return 0.0;
    }
}
