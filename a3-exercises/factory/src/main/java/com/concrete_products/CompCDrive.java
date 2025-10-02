package main.java.com.concrete_products;
import main.java.com.interfaces.HardDrive;

public class CompCDrive implements  HardDrive{
    private final int capacityCDrive = 1024;
    public void hardDriveCapacity(){
        System.out.println("Computer C Drive = " + capacityCDrive + "GB");
    }

    @Override
    public String toString(){
        return "Computer C Drive = " + capacityCDrive + "GB";
    }
}
