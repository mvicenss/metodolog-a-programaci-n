package src.main.java.com;

public class ErrorNotification extends Notification{

    public ErrorNotification(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public String notifyUser(String message){
        String subject = "ERRROR ALERT";
        String body = "Error detected: " + message;

        messageSender.sendMessage(subject, body);
        return "Notification sent";
    }


}