import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int presentWeight;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        this.presentWeight = 0;
    }
    
    public void addItem(Item item){
        if(this.presentWeight + item.getWeight() <= this.maxWeight){
            items.add(item);
            presentWeight += item.getWeight();
        }    
    }
    
    public Item heaviestItem(){
        if(items.size() == 0){
            return null;
        }
        
        Item heaviestItem = items.get(0);
        
        for(Item item : items){
            if(heaviestItem.getWeight() < item.getWeight()){
                heaviestItem = item;
            }
        }
        return heaviestItem;
        
    }
    
    public void printItems(){
        for(Item item : items){
            System.out.println(item);
        }
    }

    public int totalWeight() {
        return presentWeight;
    }
    

    @Override
    public String toString() {
        if(items.isEmpty()){
            return "no items(" + this.presentWeight + " kg)";
        }
        if(items.size() == 1){
            return items.size() + " item(" + this.presentWeight + " kg)";
        }
        return items.size() + " items(" + this.presentWeight + " kg)";
    }
    
    
    
}
