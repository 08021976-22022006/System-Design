package di;

public class NotificationSender {
    private MessageService messageService;

    // Constructor Injection
    // public NotificationSender(MessageService service){
    //     this.messageService = service;
    // }

    // Setter Injection
    public void setMessageService(MessageService service){
        this.messageService = service;
    }

    public void notifyUser(String message){
        messageService.sendMessage(message);
    }
}
