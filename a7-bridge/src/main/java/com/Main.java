package src.main.java.com;

public class Main{
    static void main (String[] args){
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SMSSender();
        MessageSender whatsappSender = new WhatsAppSender();

        Notification errorEmailNotification = new ErrorNotification((emailSender));
        Notification reminderSmsNotification = new ReminderNotification(smsSender);
        Notification whatsappNotification = new PromotionNotification((whatsappSender));

        errorEmailNotification.notifyUser("The system found an critical error");
        reminderSmsNotification.notifyUser("Doctor's appointment at 10am");
        whatsappNotification.notifyUser("3x1 in diapers! Only today!");
    }
}