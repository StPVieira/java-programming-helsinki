
package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    
    private ArrayList<Sensor> sensorList;
    private List<Integer> readingsValues;
    
    public AverageSensor(){
        this.sensorList = new ArrayList<>();
        this.readingsValues = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd){
        this.sensorList.add(toAdd);
    }
    
    @Override
    public boolean isOn() {
        for(Sensor sensor : this.sensorList){
            if(sensor.isOn() == false){
                return false;
            }
        }
        return true;        
    }

    @Override
    public void setOn() {
        for(Sensor sensor : this.sensorList){
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for(Sensor sensor : this.sensorList){
            sensor.setOff();
        }
    }
    
    public List<Integer> readings(){
        return this.readingsValues;
    }

    @Override
    public int read() {
        if(this.isOn() == false || this.sensorList.isEmpty()){
            throw new UnsupportedOperationException("Unknown");
        }
        int sum = 0;
        int count = 0;
        for(Sensor sensor : this.sensorList){
            sum += sensor.read();
            count++;
        }
        this.readingsValues.add(sum / count);
        return sum / count; 
    }
    
}
