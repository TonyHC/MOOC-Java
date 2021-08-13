
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Warehouse {
    private Map<String, Integer> stockPrice;
    private Map<String, Integer> productStock;
    
    public Warehouse() {
        this.stockPrice = new HashMap<>();
        this.productStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.stockPrice.put(product, price);
        this.productStock.put(product, stock);
    }
    
    public int price(String product) {
        if(this.stockPrice.get(product) == null)
            return -99;
        
        return this.stockPrice.get(product);
    }
    
    public int stock(String product) {
        if(this.productStock.get(product) == null)
            return 0;
        
        return this.productStock.get(product);
    }
    
    public boolean take(String product) {
        int currentStock = stock(product);
        if(currentStock > 0) {
            currentStock -= 1;
            this.productStock.put(product, currentStock);
            return true;
        }
        
        return false;
    }
    
    public Set<String> products() {
        Set<String> products = new HashSet<>();
        for(String productName : this.productStock.keySet()) {
            products.add(productName);
        }
        
        return products;
    }
}
