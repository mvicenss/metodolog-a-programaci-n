

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Concrete Observer
class Client implements Observer {
    private String name; //Name of the client
    //Interests
    private String interest1;
    private String interest2;
    private String interest3;

    public Client(String name, String interest1, String interest2, String interest3) {
        this.name = name;
        this.interest1 = interest1;
        this.interest2 = interest2;
        this.interest3 = interest3;
    }

    @Override //Checks if the observer cares about a certain product / ConcreteSubject
    public boolean isInterestedIn(String productType) {
        return productType.equals(interest1) || productType.equals(interest2) || productType.equals(interest3);
    }

    @Override //Update sent to observers
    public void update(String message) {
        System.out.println(name + " received: " + message);
    } //Print the update
}
