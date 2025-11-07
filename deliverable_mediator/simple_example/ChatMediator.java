package simple_example;


/*
 - Mediator Interface : Defines the operations the Users must use to send mesages and register themselves in the Mediator (ChatRoom)
 - This concract between ChatMediator and the Users "separates" one user from another
 */
public interface ChatMediator{
    void sendMessage(String message, User origin);
    void registerUser(User user);
}