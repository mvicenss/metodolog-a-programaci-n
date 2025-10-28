package src.main.java.com;

//Objects of this class will hold common data + unique data (Police)
public class ConcreteFlyweightPolice implements Flyweight {


    private String vehicleType;
    private String color;
    private String icon;

    public ConcreteFlyweightPolice(String vehicleType, String color, String icon) {
        this.vehicleType = vehicleType;
        this.color = color;
        this.icon = icon;
    }

    @Override
    public void render(int x, int y, double speed, int direction){
        System.out.println("Rendering vehicle [" + vehicleType + "] at (" + x + ", " + y + ") moving at " + speed + " km/h towards " + direction + "º." );
    }

}
