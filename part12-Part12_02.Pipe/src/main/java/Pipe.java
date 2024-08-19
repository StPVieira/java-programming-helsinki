
import java.util.ArrayList;


public class Pipe<T> {
    private ArrayList<T> t;
    
    public Pipe(){
        this.t = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.t.add(value);
    }
    
    public T takeFromPipe(){
        if(this.t.isEmpty()){
            return null;
        }
        T value = this.t.get(0);
        this.t.remove(0);
        return value;
    }
    
    public boolean isInPipe(){
        if(this.t.isEmpty()){
            return false;
        }
        return true;
    }
}
