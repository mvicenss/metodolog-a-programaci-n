package main.java.com.concrete_products;
import main.java.com.interfaces.HardDrive;

public class CompBDrive implements HardDrive {
    private final int capacityDriveB = 512;
    public void hardDriveCapacity(){
        System.out.println("Computer B Drive = " + capacityDriveB + "GB");
    }

    @Override
    public String toString(){
        return "Computer B Drive = " + capacityDriveB + "GB";
    }
}
