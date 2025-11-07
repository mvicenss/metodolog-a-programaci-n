package simple_example;

import java.util.ArrayList;
import java.util.List;

/*
 - Concrete Mediator: Keeps the list of regtistered users + Coordinates message sending between users (without them acknowledging eachother)
 */
public class ChatRoom implements ChatMediator{

    //List of users that are participating in the chat
    private List<User> users;

    //Initialize List as ArrayList
    public ChatRoom(){
        this.users = new ArrayList<>();
    }

    //Allows an User to register in the Mediator
    @Override
    public void registerUser(User user) {
        this.users.add(user);
    }

    //Sends the message to all users except the remitent (origin) - Mediator encapsulates the logic of message distribution
    @Override
    public void sendMessage (String message, User origin) {
        System.out.println("-- " + origin.getName() + " --: " + message);

        //Since this is a chat room, the mediator sends the message to everone except the emiter
        for (User user : users) {
            if(user != origin){
                user.receive(message);
            }
        }
    }

}
