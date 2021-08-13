
public class Main {

    public static void main(String[] args) {
        Message message1 = new Message("Mark", "Testing....");
        Message message2 = new Message("Tom", "Dlakmflkmfsl");
        
        MessagingService ms = new MessagingService();
        ms.add(message1);
        ms.add(message2);
        
        System.out.println(ms.getMessages());
    }
}
