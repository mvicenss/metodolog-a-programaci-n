package src.main.java.com;

public class PromotionNotification extends Notification{
    public PromotionNotification(MessageSender messageSender) {super(messageSender);}

    @Override
    public String notifyUser(String message){
        String subject = "DIA";
        String body = "Message: " + message;

        messageSender.sendMessage(subject,body);
        return "Message recieved";
    }
}
