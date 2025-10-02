package abstractfactory.src.main.java.com.concrete_components;

import abstractfactory.src.main.java.com.interfaces.HardDrive;

public class CompCDriveAbs implements HardDrive {
    private final int capacityDriveC = 1012;
    @Override
    public void driveCapacity(){
        System.out.println(this.toString());
    }

    public String toString(){
        return "Computer C Hard Drive = " + capacityDriveC + "GB";
    }
}
