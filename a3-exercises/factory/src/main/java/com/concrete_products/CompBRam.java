package main.java.com.concrete_products;
import main.java.com.interfaces.Ram;

public class CompBRam implements Ram {
    private final int capacityRamB = 16;
    public void ramCapacity(){
        System.out.println("Computer B RAM = " + capacityRamB + "GB");
    }

    @Override
    public String toString(){
        return  "Computer B RAM = " + capacityRamB + "GB";
    }
}
