

public class Main {

    public static void main(String[] args) {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 500.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(41.0);
        juice.takeFromWarehouse(4139);
        juice.addToWarehouse(489);
        juice.addToWarehouse(589);

        juice.printAnalysis();
    }
}
