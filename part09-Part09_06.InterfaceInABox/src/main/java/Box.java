
import java.util.ArrayList;

public class Box implements Packable {
    private ArrayList<Packable> box;
    private double maxWeight;
    
    public Box(double maxWeight){
        this.box = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void add(Packable item){
        if(weight() + item.weight() <= maxWeight){
            box.add(item);
        }
    }
    
    public double weight(){
        double weight = 0;
        
        for(Packable item : box){
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + box.size() + " items, total weight " + weight() + " kg";
    }
    
    
}
