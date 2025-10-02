package abstractfactory.src.main.java.com.concrete_components;

import abstractfactory.src.main.java.com.interfaces.HardDrive;

public class ComADriveAbs implements HardDrive {
    private final int capacityDriveA = 300;

    @Override
    public void driveCapacity() {
        System.out.println(this.toString());
    }

    public String toString(){
        return "Computer A Hard Drive = " + capacityDriveA  + "GB";
    }
}
