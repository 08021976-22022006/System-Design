package di;


// 1. Constructor Injection --> In NotificationSender
// 2. Setter Injection
// 3. Interface Injection
// 4. Annotations --> Only in "Spring"  Use @Autowiring dependency
public class Main {
    public static void main(String[] args) {
        // Constructor Injection
        // MessageService service = new Email();
        // NotificationSender notificationSender = new NotificationSender(service);
        // notificationSender.notifyUser("Email is sent!!");

        // Setter Injection
        MessageService service = new Email();
        NotificationSender notificationSender = new NotificationSender();
        notificationSender.setMessageService(service);
    }
}
