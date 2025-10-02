package abstractfactory.src.main.java.com.concrete_components;
import abstractfactory.src.main.java.com.interfaces.Ram;

public class CompARamAbs implements Ram{
    private final int capacityRamA = 8;
    @Override
    public void ramCapacity(){
        System.out.println(this.toString());
    }

    public String toString(){
        return "Computer A Ram = " + capacityRamA + "GB";
    }
}
