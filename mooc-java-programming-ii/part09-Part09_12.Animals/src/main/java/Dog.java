
public class Dog extends Animal implements NoiseCapable{
    private String name;
    
    public Dog() {
        this("Dog");
    }
    
    public Dog(String name) {
        super(name);
    }
    
    public void bark() {
        System.out.println(getName() + " barks");
    }

    @Override
    public void makeNoise() {
        bark();
    }
}
