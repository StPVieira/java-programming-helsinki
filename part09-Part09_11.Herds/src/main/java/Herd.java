
import java.util.ArrayList;

public class Herd implements Movable{
    private ArrayList<Movable> herd;
    
    public Herd(){
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        herd.add(movable);
    }

    @Override
    public String toString() {
        String result = "";
        for(Movable organism : herd){
            result += organism + "\n";
        }
        return result;
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable organism : herd){
            organism.move(dx, dy);
        }
    }
    
}
