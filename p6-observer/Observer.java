
// Observer interface
interface Observer {
    void update(String message); //Update method
    boolean isInterestedIn(String productType); //Decides if a certain observer is interested in a notif + how to handle it
}
