
import java.util.ArrayList;


public class ChangeHistory{
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        history.add(status);
    }
    
    public double maxValue(){
        if(history.size() == 0){
            return 0.0;
        }
        double maxValue = history.get(0);
        for(int i = 0; i < history.size(); i++){
            if(history.get(i) > maxValue){
                maxValue = history.get(i);
            }
        }
        return maxValue;
        
    }
    
    public double minValue(){
        if(history.size() == 0){
            return 0.0;
        }
        double minValue = history.get(0);
        for(int i = 0; i < history.size(); i++){
            if(history.get(i) < minValue){
                minValue = history.get(i);
            }
        }
        return minValue;
    }
    
    public double average(){
        if(history.size() == 0){
            return 0.0;
        }
        double sum = 0;
        int count = 0;
        
        for(Double value : history){
            sum += value;
            count++;
        }
        return sum / count;
    }
    
    public void clear(){
        history.clear();
    }

    @Override
    public String toString() {
        return history.toString();
    }

}
