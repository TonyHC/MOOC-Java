

public class Main {

    public static void main(String[] args) {
        BoxWithMaxWeight fruitBox = new BoxWithMaxWeight(10);
        fruitBox.add(new Item("Apple", 1));
        fruitBox.add(new Item("Banana", 1));
        fruitBox.add(new Item("Watermelon", 8));
        fruitBox.add(new Item("Pineapple", 2));
        
        System.out.println(fruitBox.isInBox(new Item("Banana")));
        System.out.println(fruitBox.isInBox(new Item("Watermelon")));
        System.out.println(fruitBox.isInBox(new Item("Pineapple")));
        
        System.out.println("----");
       
        OneItemBox award = new OneItemBox();
        award.add(new Item("Attendance", 4));
        award.add(new Item("Fake", 1));
        
        System.out.println(award.isInBox(new Item("Attendance")));
        System.out.println(award.isInBox(new Item("Fake")));
        
        System.out.println("----");
        
        MisplacingBox box = new MisplacingBox();
        box.add(new Item("Attendance", 4));
        box.add(new Item("Watermelon", 8));
        
        System.out.println(box.isInBox(new Item("Attendance")));
        System.out.println(box.isInBox(new Item("Watermelon")));
    }
}
