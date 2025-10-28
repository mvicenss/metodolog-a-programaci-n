package src.main.java.com;

//Objects of this class will hold common data + unique data (Buses)
public class ConcreteFlyweightBus implements  Flyweight {

    //private static final double MAX_SPEED = 60.0;

    private String vehicleType;
    private String icon;
    private String color;

    public ConcreteFlyweightBus(String vehicleType, String icon, String color) {
        this.vehicleType = vehicleType;
        this.icon = icon;
        this.color = color;
    }

    @Override
    public void render (int x, int y, double speed, int direction) {
        //double cappedSpeed = Math.min(speed, MAX_SPEED);
        System.out.println("Rendering vehicle [" + vehicleType + "] at (" + x + ", " + y + ") moving at " + speed + " km/h towards " + direction + "º." );
    }

}
