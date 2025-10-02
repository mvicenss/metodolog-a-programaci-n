package main.java.com.concrete_products;
import main.java.com.interfaces.Ram;
public class CompCRam implements Ram{
    private final int capacityRamC = 32;
    public void ramCapacity(){
        System.out.println("Computer C RAM = " + capacityRamC + "GB");
    }

    @Override
    public String toString(){
        return "Computer C RAM = " + capacityRamC + "GB";
    }
}
