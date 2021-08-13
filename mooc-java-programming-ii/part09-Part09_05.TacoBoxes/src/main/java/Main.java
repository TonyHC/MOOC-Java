
public class Main {

    public static void main(String[] args) {
        TripleTacoBox tripleTacoBox = new TripleTacoBox();
        tripleTacoBox.eat();
        tripleTacoBox.tacosRemaining();
        
        CustomTacoBox customTacoBox = new CustomTacoBox(8);
        while(customTacoBox.tacosRemaining() > 0) {
            customTacoBox.eat();
            System.out.println(customTacoBox.tacosRemaining());
        }
    }
}
