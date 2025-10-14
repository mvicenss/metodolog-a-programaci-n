package src.main.java.com;

public class ReminderNotification extends Notification{

    public ReminderNotification(MessageSender messageSender){super(messageSender);}

    @Override
    public String notifyUser(String message){
        String subject = "REMINDER ALERT";
        String body = "Reminder: " + message;

        messageSender.sendMessage(subject,body);
        return "Reminder sent";
    }
}
