package abstractfactory.src.main.java.com.concrete_components;

import abstractfactory.src.main.java.com.interfaces.Ram;

public class CompCRamAbs implements Ram {
    private final int capacityRamC = 32;

    @Override
    public void ramCapacity() {
        System.out.println(this.toString());
    }

    public String toString(){
        return "Computer C RAM = " + capacityRamC + "GB";
    }
}
