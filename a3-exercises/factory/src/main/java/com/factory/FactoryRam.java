package main.java.com.factory;
import main.java.com.concrete_products.CompARam;
import main.java.com.concrete_products.CompBRam;
import main.java.com.concrete_products.CompCRam;
import main.java.com.factory.BaseCreator;
import main.java.com.interfaces.HardDrive;
import main.java.com.interfaces.Ram;
import main.java.com.interfaces.Screen;

import java.util.Random;

public class FactoryRam implements BaseCreator {
    public Ram createRam(){
        int option = new Random().nextInt(3);//Random value from 0 to 2 (3 is boundary and not inhcluded)
        switch (option){
            case 0:
                return new CompARam();
            case 1:
                return new CompBRam();
            case 2:
                return new CompCRam();
        }
        throw new IllegalStateException("Value not assigned.");
    }

    @Override
    public HardDrive createHardDrive(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Screen createScreen(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
