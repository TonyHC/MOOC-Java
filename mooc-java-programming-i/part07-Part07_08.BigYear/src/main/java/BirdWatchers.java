
import java.util.ArrayList;


public class BirdWatchers {
    private ArrayList<String> name;
    private ArrayList<String> latinName;
    private ArrayList<Integer> observations;
    
    public BirdWatchers() {
        this.name = new ArrayList<>();
        this.latinName = new ArrayList<>();
        this.observations = new ArrayList<>();
    }
    
    public void add(String name, String latinName) {
        this.name.add(name);
        this.latinName.add(latinName);
        this.observations.add(0);
    }
    
    public boolean observation(String bird) {
        for(int i = 0; i < name.size(); i++) {
            if(this.name.get(i).equals(bird)) {
                int observationCount = this.observations.get(i) + 1;
                this.observations.set(i, observationCount);
                return true;
            }
        }
        
        return false;
    }
    
    public void printAllBirds() {
        for(int i = 0; i < name.size(); i++) {
            if(this.observations.get(i) == 1) {
                System.out.println(this.name.get(i) + "(" + this.latinName.get(i) + "): " + this.observations.get(i) + " observation");
            }
            
            System.out.println(this.name.get(i) + "(" + this.latinName.get(i) + "): " + this.observations.get(i) + " observations");
        }
    }
    
    public boolean findABird(String bird) {
        for(int i = 0; i < name.size(); i++) {
            if(this.name.get(i).equals(bird)) {
                if(this.observations.get(i) == 1) 
                    System.out.println(this.name.get(i) + "(" + this.latinName.get(i) + "): " + this.observations.get(i) + " observation");
                
                System.out.println(this.name.get(i) + "(" + this.latinName.get(i) + "): " + this.observations.get(i) + " observations");
                return true;
            }
        }
        
        return false;
    }
}
