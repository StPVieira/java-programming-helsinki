
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ShoppingCart {
    private Map<String, Item> cart;
    
    
    public ShoppingCart(){
        this.cart = new HashMap<>();
    }
    
    public void add(String product, int price){
        if(!cart.containsKey(product)){
            cart.put(product, new Item(product, 1, price));    
        }else {
            cart.get(product).increaseQuantity();
        }    
    }
    
    public int price(){
        int price = 0;
        for(Item item : cart.values()){
            price += item.price();
        }
        return price;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.cart);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ShoppingCart other = (ShoppingCart) obj;
        if (!Objects.equals(this.cart, other.cart)) {
            return false;
        }
        return true;
    }
    
    
    
    public void print(){
        for(Item item : cart.values()){
            System.out.println(item);
        }
    }
    
    
}
