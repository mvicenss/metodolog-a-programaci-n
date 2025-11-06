package simple_example;

public class Main {

    public static void main (String[] args){

        //1. Create mediator
        ChatMediator room = new ChatRoom();
        //room must be able to hanlde sending and registering (chatMediator)
        //room is a concrete instance of the ChatRoom class (ChatMediator cant be instantiated directly, its an interface)
        //ChatRoom, since it implements ChatMediator, allows room to use the methods of ChatMediator and ChatRoom (the user management)

        //2. Create users
        User anna = new ConcreteUser(room, "Anna");
        User tommy = new ConcreteUser(room, "Tommy");
        User peter = new ConcreteUser(room, "Peter");

        //3. Register users in mediator/chat room
        room.registerUser(anna);
        room.registerUser(tommy);
        room.registerUser(peter);

        //4. Start comms
        anna.send("Hello all!"); //Anna sends this message, but doesn't know who is in the room. The other participants will get the msg
        tommy.send("Hi Anna!");

    }
}
