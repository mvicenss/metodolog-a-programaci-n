package src.main.java.com.delivery_drivers;

public class californiaAdapter extends avgSpeed{
    private final double constantKmMile = 1.60934;
    public californiaSpeed americanAdapter;


    public californiaAdapter(californiaSpeed americanAdapter){
        this.americanAdapter = americanAdapter; //CONSTRUCTOR == We initialize the variable as one from the californiaSpeed class
    }
    @Override
    public double setAvgSpeed(double speedKmh){
        double speedMph = speedKmh / constantKmMile; //converting speed
        return americanAdapter.setAvgSpeedMph(speedMph); //delegating designation of speed to the cali speed class (where operations with miles happen)
    }

    @Override
    public double calculateDistance(double hours){
        return americanAdapter.calculateDistance(hours); //Delegating distance calculation to where Miles calculations happen
    }
}