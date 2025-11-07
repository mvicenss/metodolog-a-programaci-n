package simple_example;

/*
 - Concrete Colleage: implements specific behaviour of the user
 - send delegates the delivery to Mediator
 - recieve defines what the user does when recieving a message
 */
public class ConcreteUser extends User{

    public ConcreteUser(ChatMediator mediator, String name){
        super(mediator, name);
    }

    //When sending, the user doesn't know the recievers -- Task is delegated to Mediator (knows all of the users)
    @Override
    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("  (" + this.name + " has received the message.)");
    }

}
