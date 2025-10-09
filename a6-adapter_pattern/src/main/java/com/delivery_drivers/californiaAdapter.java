package com.delivery_drivers;

public class californiaAdapter implements avgSpeed {
    
    public enum driver {AMERICAN, EUROPEAN}

    public static final double KM_per_MILE = 1.60934;
    public static final double hoursEU = 7.5;
    public static final double hoursUS = 8.0;

    private final californiaSpeed cali;
    private final double shiftLength;

    public californiaAdapter(driver contractType) {
        this.cali = new californiaSpeed();
        if (driverType == driver.AMERICAN){
            this.shiftHours = hoursUS;
        } else {
            this.shiftHours = hoursEU;
        }
    }

    @Override
    public void setAvgSpeed(double kmh) {
        if (kmh < 0){
            kmh = 0;
        }

        double mph = kmh / KM_per_MILE;

        cali.setAvgMPH(mph);
    }

    @Override
    public double calculateMaxDistanceKM() {
        double miles = cali.distanceHours(this.shiftHours);
        return miles * KM_per_MILE;
    }

}