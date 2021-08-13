
public class Main {

    public static void main(String[] args) {
        SimpleDate simpleDate = new SimpleDate(4, 3, 1998);
        System.out.println(simpleDate.equals(simpleDate));
        System.out.println(simpleDate.equals(new SimpleDate(5, 4, 1294)));
        System.out.println(simpleDate.equals(new SimpleDate(4, 3, 1998)));
    }
}
