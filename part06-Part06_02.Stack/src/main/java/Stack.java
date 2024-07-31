import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> stacks;
    
    public Stack(){
        this.stacks = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return stacks.isEmpty();
    }
    
    public void add(String value){
        stacks.add(value);
    }
    
    public String take(){
        String taken = stacks.get(stacks.size() - 1);
        stacks.remove(stacks.size() - 1);
        return taken;
    }
    
    public ArrayList<String> values(){
        for(String stack : stacks){
            return stacks;
        }
        return stacks;
            
    }
        
}
