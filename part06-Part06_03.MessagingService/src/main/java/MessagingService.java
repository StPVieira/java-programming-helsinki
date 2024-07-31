import java.util.ArrayList;
public class MessagingService {
    
    private ArrayList<Message> messages;
    
    public MessagingService(){
        this.messages = new ArrayList<>();
        
    }
    
    public void add(Message message){
        int limit = 280;
        if(message.getContent().length() <= limit ){
            messages.add(message);
        }
    }
    
    public ArrayList<Message> getMessages(){
        for(Message message : messages){
            return messages;
        }
        return messages;
    }
}
