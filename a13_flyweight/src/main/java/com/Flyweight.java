package src.main.java.com;

// Declares method that the Client will call to get work done -- Accepts extrinsic state (unique things) as parameters
public interface Flyweight {

    public void render(int x, int y, double speed, int direction); //Method to render specific details for each concrete

}
