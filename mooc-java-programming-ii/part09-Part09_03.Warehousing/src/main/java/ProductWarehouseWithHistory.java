
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);
    }
    
    public String history() {
        return this.changeHistory.toString();
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changeHistory.add(super.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double takenAmount = super.takeFromWarehouse(amount);
        this.changeHistory.add(super.getBalance());
        
        return takenAmount;
    }
    
    public void printAnalysis() {
        System.out.print("Product: " + super.getName());
        System.out.print("\nHistory: " + history());
        System.out.print("\nLargest amount of product: " + this.changeHistory.maxValue());
        System.out.print("\nSmallest amount of product: " + this.changeHistory.minValue());
        System.out.print("\nAverage: " + this.changeHistory.average());
    }
}
