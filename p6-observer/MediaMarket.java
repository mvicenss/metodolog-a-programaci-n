
import java.util.ArrayList;
import java.util.List;

// Concrete Subject
class MediaMarkt implements Subject {
    private List<Observer> observers = new ArrayList<>(); //List of observers (obs. that are looking at an obj. of this class)

    @Override
    public void attach(Observer o) {
        observers.add(o);
    } //Add observer to the list -- Subscribe

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    } //Remove observer from list -- Unsubscribe

    @Override
    public void notifyAllObservers(String productType, String message) {
        for (Observer o : observers) { //For all subscribed observers
            if (o.isInterestedIn(productType)) { //If observer is interested in the product (return of isInterestedIn is true)
                o.update(message); //Update by sending a message
            }
        }
    }

    //CALLED ON MAIN
    //Actual thing that will be notified -- A promotion on a product
    //Message is the message to be sent to observers
    public void newPromotion(String productType, String message) {
        System.out.println("MediaMarkt launches promotion for: " + productType);
        notifyAllObservers(productType, message);
    }
}