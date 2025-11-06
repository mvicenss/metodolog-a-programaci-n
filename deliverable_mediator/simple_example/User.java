package simple_example;

public abstract class User{

    protected ChatMediator mediator;
    protected String name;


    public User(ChatMediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    //Method the Mediator will call
    public abstract void receive(String message);

    //Method that allows User to start comms
    public abstract void send(String message);

    //Get name of the user
    public String getName(){
        return name;
    }

}
