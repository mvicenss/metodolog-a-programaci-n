package src.main.java.com;

//Client Class
public class Main{

    public static void main(String[] args) {
        System.out.println("=== Proxy Pattern - Environmental Sensors ===\n");

        // create sensors of Proxy
        SensorDevice humiditySensor = new SensorProxy("Humidity", "%");
        SensorDevice windSensor = new SensorProxy("Wind", "km/h");
        SensorDevice uvSensor = new SensorProxy("UV index", "UV");

        // first read
        System.out.println("\n--- First reading (humidity sensor) ---");
        System.out.println("Humidity: " + humiditySensor.readData() + "%");

        // second read still within cache time
        System.out.println("\n--- Second reading (humidity sensor) - within cache time ---");
        System.out.println("Humidity: " + humiditySensor.readData() + "%");

        //third read still in cache time
        System.out.println("\n--- Third reading (humidity sensor) - still cached ---");
        System.out.println("Humidity: " + humiditySensor.readData() + "%");

        // Wind sensor reading
        System.out.println("\n--- First reading (wind sensor) ---");
        System.out.println("Wind: " + windSensor.readData() + " km/h");

        // UV sensor reading
        System.out.println("\n--- First reading (UV sensor) ---");
        System.out.println("UV index: " + uvSensor.readData());

        // Second widn reading, still in cache time
        System.out.println("\n--- Second reading (wind sensor) - cached ---");
        System.out.println("Wind: " + windSensor.readData() + " km/h");

        // Wait for cache to expire
        System.out.println("\n--- Waiting 11 seconds for cache to expire ---");
        try {
            Thread.sleep(11000); //11s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Read after cache expires -- WILL ACCESS REAL SENSOR
        System.out.println("\n--- Fourth reading (humidity sensor) - after cache expiration ---");
        System.out.println("Humidity: " + humiditySensor.readData() + "%");

        System.out.println("\n=== Demonstration completed ===");
    }
}