package src.main.java.com.delivery_drivers;

public class californiaSpeed{
    double maxSpeedMph = 55;
    double maxTimeCal = 8;
    double avgSpeedMph = 0;

    // Calculating in Mph
    public double setAvgSpeedMph(double speedMph){
        if(speedMph>maxSpeedMph){
            return -1;
        }else{
            avgSpeedMph = speedMph;
            return avgSpeedMph;
        }

    }

    //Calculating in miles
    public double calculateDistance(double hoursCal){
        double totalDistanceCal = 0;
        if(hoursCal>maxTimeCal){
            return -1;
        }else{
            totalDistanceCal = avgSpeedMph * hoursCal;
            return totalDistanceCal;
        }
    }
}
