package src.main.java.com;

public class WhatsAppSender implements MessageSender {
    @Override
    public void sendMessage(String subject, String body){
        System.out.println("--- NEW MESSAGE ---");
        System.out.println("From: " + subject);
        System.out.println(body);
    }
}
