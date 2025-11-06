package simple_example;

import java.util.ArrayList;
import java.util.List;

//Concrete Mediator
public class ChatRoom implements ChatMediator{

    private List<User> users;

    //Initialize List as ArrayList
    public ChatRoom(){
        this.users = new ArrayList<>();
    }

    @Override
    public void registerUser(User user) {
        this.users.add(user);
    }

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
