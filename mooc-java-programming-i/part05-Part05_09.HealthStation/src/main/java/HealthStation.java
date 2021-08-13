
public class HealthStation {
    private int weighings;

    public int weigh(Person person) {
        this.weighings++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        int personWeight = person.getWeight();
        person.setWeight(++personWeight);
    }

    public int weighings() {
        return weighings;
    }
}
