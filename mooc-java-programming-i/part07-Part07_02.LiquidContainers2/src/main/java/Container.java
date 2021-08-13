
import java.util.ArrayList;


public class Container {
    private int container;
    
    public Container() {
        this.container = 0;
    }
    
    public int contains() {
        return container;
    }
    
    public void add(int amount) {
        if(amount >= 0) {
            if(this.container + amount <= 100) {
                this.container += amount;
            } else if(this.container + amount > 100) {
                this.container = 100;
            }
        }
    }
    
    public void remove(int amount) {
        if(amount >= 0 ) {
            if(this.container - amount <= 0) {
                this.container = 0;
            } else if(this.container - amount > 0) {
                this.container -= amount;
            }
        }
    }
    
    public String toString() {
        return container + "/100";
    }
}
