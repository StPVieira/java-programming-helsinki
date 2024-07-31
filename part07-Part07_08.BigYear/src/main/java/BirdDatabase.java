import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birds;
    
    public BirdDatabase(){
        this.birds = new ArrayList<>();
    }
    
    public void add(Bird bird){
        birds.add(bird);
    }
    
    public boolean observation(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                return true;
            }
        }
 
        return false;
    }
    
    public void one(Bird bird){
        System.out.println(bird);
    }
    
    public ArrayList<Bird> all(){
        return birds;
    }
    
}
