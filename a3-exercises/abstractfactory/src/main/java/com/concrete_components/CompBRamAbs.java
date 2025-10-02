package abstractfactory.src.main.java.com.concrete_components;

import abstractfactory.src.main.java.com.interfaces.Ram;

public class CompBRamAbs implements Ram {
    private final int capacityRamB = 16;
    @Override
    public void ramCapacity(){
        System.out.println(this.toString());
    }

    public String toString(){
        return "Computer B RAM = " + capacityRamB + "GB";
    }
}
