
public class Timer {
    private ClockHand seconds;
    private ClockHand hundSeconds;
    
    
    public Timer(){
        this.seconds = new ClockHand(60);
        this.hundSeconds = new ClockHand(100);
    }
    
    public void advance(){
        this.hundSeconds.advance();
            if(this.hundSeconds.value() == 0){
                this.seconds.advance();
            }
    }
    public String toString(){
        return seconds + ":" + hundSeconds;
    }
}
