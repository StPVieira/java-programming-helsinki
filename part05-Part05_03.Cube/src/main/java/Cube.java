
public class Cube {
    private int edgeLength;
    private int volume;
    
    public Cube(int edgeLength){
        this.edgeLength = edgeLength;
        this.volume = edgeLength * edgeLength * edgeLength;
        
    }
    
    public int volume(){
        volume = edgeLength * edgeLength * edgeLength;
        return volume;
    }
    
    public String toString(){
        
        return "The length of the edge is " + edgeLength + " and the volume " + volume;
    }
    
}
