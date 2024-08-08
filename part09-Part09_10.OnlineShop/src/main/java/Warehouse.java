
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> catalog;
    private Map<String, Integer> stocks;
    
    public Warehouse(){
        this.catalog = new HashMap<>();
        this.stocks = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        catalog.put(product, price);
        stocks.put(product, stock);
    }
    
    public int price(String product){
        return catalog.getOrDefault(product, -99);
    }
    
    public int stock(String product){
        return stocks.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        int newStock = this.stock(product) - 1;
        if(newStock >= 0){
            stocks.replace(product, newStock);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        return stocks.keySet();
    }
}
