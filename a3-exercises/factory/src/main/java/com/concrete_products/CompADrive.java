package main.java.com.concrete_products;

import main.java.com.interfaces.HardDrive;

public class CompADrive implements HardDrive{
    private final int capacityDriveA = 300;
    public void hardDriveCapacity(){
        System.out.println("Computer A Hard Drive = " + capacityDriveA + "GB");
    }

    @Override
    public String toString(){
        return "Computer A Hard Drive = " + capacityDriveA + "GB";
    }
}