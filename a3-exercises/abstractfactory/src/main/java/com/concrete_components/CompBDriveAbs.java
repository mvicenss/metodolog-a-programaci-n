package abstractfactory.src.main.java.com.concrete_components;

import abstractfactory.src.main.java.com.interfaces.HardDrive;

public class CompBDriveAbs implements HardDrive {
    private final int capacityDriveB = 512;

    @Override
    public void driveCapacity(){
        System.out.println(this.toString());
    }

    public String toString(){
        return "Computer B Hard Drive = " + capacityDriveB + "GB";
    }
}
