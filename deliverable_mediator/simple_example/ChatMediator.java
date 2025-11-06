package simple_example;

public interface ChatMediator{
    void sendMessage(String message, User origin);
    void registerUser(User user);
}