package src.main.java.com;

abstract class Notification{

    protected MessageSender messageSender; //Reference to the class - Allows for any subclass of Notification to use and object of that class
    public Notification (MessageSender messageSender){
        this.messageSender = messageSender;
    }

    abstract String notifyUser(String message);
}