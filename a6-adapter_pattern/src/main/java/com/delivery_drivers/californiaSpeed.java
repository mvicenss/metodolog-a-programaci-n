package com.delivery_drivers;

public class californiaSpeed {
    
    private static final double maxMPH = 55.0; // Speed limit in California in mph
    public double avgMPH = 0.0; // Average speed in mph

    public void setAvgMPH(double mph) {
        if (mph < 0) {
            mph = 0;
        }

        this.avgMPH = Math.min(mph, maxMPH);
    }

    public double getAvgMPH() {
        return this.avgMPH;
    }

    public double distanceForHours(double hours) {
        if (hours < 0) {
            hours = 0;
        }
        
        double distance = this.avgMPH * hours;
        return distance;
    }

}