
import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {
    private Map<String, Item> shoppingCartItems;

    public ShoppingCart() {
        this.shoppingCartItems = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if(this.shoppingCartItems.get(product) == null) {
            Item item = new Item(product, 1, price);
            this.shoppingCartItems.put(product, item);
        } else {
            Item item = this.shoppingCartItems.get(product);
            item.increaseQuantity();
            this.shoppingCartItems.put(product, item);
        }
    }
    
    public int price() {
        int totalPrice = 0;
        for(Item item : this.shoppingCartItems.values()) {
            totalPrice += item.price();
        }
        
        return totalPrice;
    }
    
    public void print() {
        for(Item item : this.shoppingCartItems.values()) {
            System.out.println(item);
        }
    }
}
