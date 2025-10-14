package src.main.java.com;

public class EmailSender implements MessageSender{
    @Override
    public void sendMessage(String subject, String body) {
        System.out.println("--- SENDING EMAIL --- ");
        System.out.println("Subject: " + subject);
        System.out.println(body);

    }
}