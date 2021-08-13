
import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messageList;
    
    public MessagingService() {
        this.messageList = new ArrayList<>();
    }
    
    public void add(Message message) {
        if(message.getContent().length() <= 280) {
            this.messageList.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return messageList;
    }
}
