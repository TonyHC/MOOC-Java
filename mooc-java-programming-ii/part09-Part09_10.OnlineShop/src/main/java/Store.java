import java.util.Scanner;

public class Store {
    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("\nOur selection:");

        warehouse.printWarehouse();
        System.out.println();

        while (true) {
            System.out.print("What to put in the cart (Press enter to go to the register): ");
            String product = scanner.nextLine();
            if (product.isEmpty()) {
                break;
            }

            if (warehouse.take(product)) {
                cart.add(product, this.warehouse.price(product));
            }
        }

        System.out.println("\nYour shopping cart contents:");
        cart.print();
        System.out.println("Total: " + cart.price());
    }
}