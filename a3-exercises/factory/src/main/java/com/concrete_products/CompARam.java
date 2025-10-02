package main.java.com.concrete_products;
import main.java.com.interfaces.Ram;


//"implements" == this class must define the methods stated in the Ram class/interface (all of them)
public class CompARam implements Ram{
    private final int capacityA = 8;
    public void ramCapacity(){
        System.out.println("Computer A RAM = " + capacityA + "GB");
    }

    @Override
    public String toString(){
        return "Computer A RAM = " + capacityA + "GB";
    }
}