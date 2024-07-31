import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int presentWeight;
    
    public Hold(int weight){
        this.maxWeight = weight;
        this.suitcases = new ArrayList<>();
        this.presentWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.presentWeight + suitcase.totalWeight() <= this.maxWeight){
            suitcases.add(suitcase);
            presentWeight += suitcase.totalWeight();
        }    
    }
    
    public void printItems(){
        for(Suitcase suitcase : suitcases){
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases(" + this.presentWeight + " kg)"; 
    }
    
    
}
