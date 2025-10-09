package src.main.java.com.delivery_drivers;
import src.main.java.com.delivery_drivers.avgSpeed;

public class europeSpeed extends avgSpeed {

    double avgSpeed;
    double maxSpeed = 100;
    double maxTime = 7.5;

    @Override
    public double setAvgSpeed(double speedKmh){ //No need to calculate average speed, that is the input given by Client
        if(speedKmh > maxSpeed){
            return -1;
        }else{
            avgSpeed = speedKmh;
            return avgSpeed;
        }

    }

    @Override
    public double calculateDistance(double hours){
        double totalDistance = 0;
        if(hours > maxTime){
            return -1;
        }else{
            //v=s/t -- s=v*
            totalDistance = avgSpeed * hours;
            return totalDistance;
        }
    }
}
