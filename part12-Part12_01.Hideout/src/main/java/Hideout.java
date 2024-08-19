
public class Hideout<T> {
    private T t;
    
    public Hideout(){
        this.t = null;
    }
    
    public void putIntoHideout(T toHide){
        this.t = toHide;
    }
    
    public T takeFromHideout(){
        if(this.t == null){
            return null;
        }
        T value = this.t;
        this.t = null;
        return value;
    }
    
    public boolean isInHideout(){
        if(this.t == null){
            return false;
        }
        return true;
    }
}
