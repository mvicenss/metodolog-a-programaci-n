package main.java.com.factory;
import main.java.com.concrete_products.CompADrive;
import main.java.com.concrete_products.CompBDrive;
import main.java.com.concrete_products.CompCDrive;
import main.java.com.factory.BaseCreator;
import main.java.com.interfaces.HardDrive;
import main.java.com.interfaces.Ram;
import main.java.com.interfaces.Screen;

import java.util.Random;

public class FactoryDrive implements BaseCreator {
    public HardDrive createHardDrive(){
        int option = new Random().nextInt(3);
        switch(option){
            case 0:
                return new CompADrive();
            case 1:
                return new CompBDrive();
            case 2:
                return new CompCDrive();
        }
        throw new IllegalStateException("Option not defined");
    }

    @Override
    public Screen createScreen() {
        throw new  UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Ram createRam() {
        throw new  UnsupportedOperationException("Not supported yet.");
    }
}
