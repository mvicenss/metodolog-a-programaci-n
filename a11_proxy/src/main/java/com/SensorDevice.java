package src.main.java.com;

//"Subject" -- Interface common to Logic and Proxy classes
public interface SensorDevice {

    public double readData(); //Gets what the sensor measures -- All classes MUST have this

}
