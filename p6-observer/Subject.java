
// Subject interface -- Interface for objects to be observed
interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyAllObservers(String productType, String message);
}