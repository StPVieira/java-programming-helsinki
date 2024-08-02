import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> iou;
    
    public IOU(){
        this.iou = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        this.iou.put(toWhom, amount);
    } 
    
    public double howMuchDoIOweTo(String toWhom){
        for(String person : iou.keySet()){
            if(person.equals(toWhom)){
                return iou.getOrDefault(person, 0.0);
            }
        }
        return 0.0;
    }
}
