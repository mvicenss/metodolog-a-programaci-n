package src.main.java.com;

public class SMSSender implements MessageSender{
    @Override
    public void sendMessage(String subject, String body) {
        System.out.println("--- SENDING MESSAGE ---");
        System.out.println("Subject: " + subject);
        System.out.println(body);
    }
}