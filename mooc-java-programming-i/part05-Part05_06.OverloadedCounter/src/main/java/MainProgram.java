
public class MainProgram {

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        counter1.increase();
        counter1.increase(23);
        counter1.decrease(21);
        counter1.decrease();
        System.out.println(counter1.value());
        
        
        Counter counter2 = new Counter(25);
        counter2.increase();
        counter2.decrease(-31);
        counter2.decrease();
        counter2.increase(12);
        System.out.println(counter2.value());
    }
}
