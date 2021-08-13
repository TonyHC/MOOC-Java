
public class Cat extends Animal implements NoiseCapable{
    private String name;
    
    public Cat() {
        this("Cat");
    }
    
    public Cat(String name) {
        super(name);
    }
    
    public void purr() {
        System.out.println(getName() + " purrs");
    }

    @Override
    public void makeNoise() {
        purr();
    }
}
