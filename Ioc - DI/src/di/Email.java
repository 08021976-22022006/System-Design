package di;

public class Email implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Message Sent: " + message);
    }

}
