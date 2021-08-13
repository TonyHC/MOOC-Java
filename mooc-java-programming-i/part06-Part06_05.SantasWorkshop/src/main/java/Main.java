
public class Main {

    public static void main(String[] args) {
        Gift toy = new Gift("Hot Wheel", 1);
        Gift book = new Gift("Dragon", 12);

        Package p = new Package();
        p.addGift(toy);
        System.out.println(p.totalWeight());
        p.addGift(book);
        System.out.println(p.totalWeight());
    }
}
