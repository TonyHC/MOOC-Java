
public class Main {

    public static void main(String[] args) {
        Dog test = new Dog("Test");
        test.sleep();
        test.bark();
        test.eat();
        
        NoiseCapable dog = new Dog();
        dog.makeNoise();
        
        NoiseCapable noir = new Cat("Noir");
        noir.makeNoise();
        Cat c = (Cat) noir;
        c.makeNoise();
        c.eat();
        c.sleep();
   }
}
