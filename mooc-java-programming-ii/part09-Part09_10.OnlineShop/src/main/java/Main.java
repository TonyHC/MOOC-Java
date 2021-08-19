import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("Coffee", 5, 10);
        warehouse.addProduct("Milk", 3, 20);
        warehouse.addProduct("Cream", 2, 55);
        warehouse.addProduct("Bread", 7, 8);
        warehouse.addProduct("Bagel", 4, 50);
        warehouse.addProduct("Donut", 2, 30);

        Scanner scanner = new Scanner(System.in);
        Store store = new Store(warehouse, scanner);
        store.shop("John");
    }
}