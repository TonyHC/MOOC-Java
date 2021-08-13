
public class Main {

    public static void main(String[] args) {
        SimpleDate date1 = new SimpleDate(5, 12, 1948);
        SimpleDate date2 = new SimpleDate(5, 12, 1829);
        System.out.println(date1.equals(date1));
        System.out.println(date1.equals(new SimpleDate(5, 12, 1949)));
        System.out.println(date1.hashCode());
        System.out.println(date2.hashCode());
    }
}
