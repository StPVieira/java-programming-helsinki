
public class Counter {
    private int value;
    
    public Counter(int startValue){
        this.value = startValue;
    }
    
    public Counter(){
        this(0);
    }
    
    public int value(){
        return value;
    }
    
    public void decrease(){
        this.decrease(1);
    }
    
    public void decrease(int decreaseBy){
        if(decreaseBy > 0){
            value -= decreaseBy;
        }    
    }
    
    public void increase(){
        this.increase(1);
    }
    
    public void increase(int increaseBy){
        if(increaseBy > 0){
            value += increaseBy;
        }
    }
}
