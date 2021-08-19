import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStocks;

    public Warehouse() {
        this.productPrices = new HashMap<>();
        this.productStocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productPrices.putIfAbsent(product,price);
        this.productStocks.putIfAbsent(product,stock);
    }

    public int price(String product) {
        if (!this.productPrices.containsKey(product))
            return -99;

        return this.productPrices.get(product);
    }

    public int stock(String product) {
        if (!this.productStocks.containsKey(product))
            return 0;

        return this.productStocks.get(product);
    }

    public boolean take(String product) {
        if (!this.productStocks.containsKey(product))
            return false;

        int currentStock = this.productStocks.get(product);
        if (currentStock - 1 >= 0) {
            this.productStocks.put(product,this.productStocks.get(product) - 1);
        }

        return currentStock >= 1;
    }

    public Set<String> products() {
        // Set<String> products = new HashSet<>(this.productStocks.keySet());
        Set<String> products = new HashSet<>();
        for (String key : this.productStocks.keySet()) {
            products.add(key);
        }
        return products;
    }

    public void printWarehouse() {
        for (String key : products()) {
            System.out.println(key + " $" + this.productPrices.get(key) + " [" + this.productStocks.get(key) + "]");
        }
    }
}