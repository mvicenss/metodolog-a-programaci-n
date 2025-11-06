package simple_example;

public class ConcreteUser extends User{

    public ConcreteUser(ChatMediator mediator, String name){
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("  (" + this.name + " has received the message.)");
    }

}
