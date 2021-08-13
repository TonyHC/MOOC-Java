
import java.util.ArrayList;


public class Herd implements Movable{
    private ArrayList<Movable> herdList;
    
    public Herd() {
        this.herdList = new ArrayList<>();
    }
    
    public String toString() {
        String herd = "";
        for(Movable organism : this.herdList) {
            herd += organism + "\n";
        }
        
        return herd;
    }

    public void addToHerd(Movable movable) {
        this.herdList.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable movable : this.herdList) {
            movable.move(dx, dy);
        }
    }
}
