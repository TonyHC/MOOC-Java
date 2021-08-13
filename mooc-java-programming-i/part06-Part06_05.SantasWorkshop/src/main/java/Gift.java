
public class Gift {
    private String name;
    private int weight;
    
    public Gift(String mName, int mWeight) {
        this.name = mName;
        this.weight = mWeight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    public String toString() {
        return name + " (" + weight + " kg)";
    }
}
