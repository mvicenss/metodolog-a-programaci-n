package src.main.java.com;


//Proxy class --Holds reference to Logic class - Main will interact with this
public class SensorProxy implements SensorDevice {


    /* WHAT IS CACHE? - Temp storing mechanism that stores data recently used to avoid repeated access to valuable resources.

        In this case, the cache stores the LAST READING of the sensor to avoid repeated requests to remote object

     */

    private SensorLogic sensorLogic; //Reference to real objects
    private double cacheValue; //Strores last value red
    private long lastReadTime; //Time stamp of last reading
    private static final long CACHE_VALIDITY = 10000; // max cache time valid 10000ms
    private String type;
    private String unit;

    public SensorProxy(String type, String unit) {
        this.type = type;
        this.unit = unit;
        this.lastReadTime = 0;
    }

    //Method that WILL BE ACCESSED by Main class
    @Override
    public double readData() {
        long currentTime = System.currentTimeMillis(); //Value of current time in ms

        // verify if current time is valid
        /*
        1st reading -- lastReadTime = 0 -> No data in cache -- No last timestamp == ACCESSING REAL VALUE (sensorLogic)
        2nd-n readings -- currentTime - lastReadTime < 10s
            IF TRUE == Return cacheValue (we are within the time limit, so to avoid calling real objects, we reuse the value)
            IF FALSE == "Restart loop" - We access the real object and the cache, cacheValue, lastReadTime are restarted
         */
        if (currentTime - lastReadTime < CACHE_VALIDITY && lastReadTime != 0) { // remaining time < max time AND there is a previous reading
            System.out.println("[Proxy] Returning cached value: " + cacheValue + " " + unit);
            return cacheValue;
        }else{
            // If cache is not valid, get values from real sensor (access SensorLogic directly instead of Proxy)
            System.out.println("[Proxy] Cache expired or first read. Requesting data from real sensor...");
        }

        if (sensorLogic == null) { //Check if the real sensor has already been created, that is, when cache is expired/is first read
            sensorLogic = new SensorLogic(type, unit);
        }

        cacheValue = sensorLogic.readData(); //Costly operation -- readData() waits two seconds and generates a random value
        lastReadTime = currentTime;//Since we read something, update lastReadTime

        return cacheValue;
    }
}
