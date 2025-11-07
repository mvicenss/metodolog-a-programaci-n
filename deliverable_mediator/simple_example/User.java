package simple_example;


/*
 - Concrete Colleague: Each user keeps a reference to the Mediator (interface) to communicate.
 - It defines the operation the Mediator can call OR that the User can use to start communications
 */
public abstract class User{

    protected ChatMediator mediator;//Reference to Mediator to delegate communications
    protected String name;

    //User recieves Mediator (ChatMediator) when creating "it"
    public User(ChatMediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    //Method the Mediator will call when a message is recieved
    public abstract void receive(String message);

    //Method that allows User to start comms
    public abstract void send(String message);

    //Get name of the user
    public String getName(){
        return name;
    }

}
