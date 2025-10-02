package main.java.com.factory;
import main.java.com.concrete_products.CompAScreen;
import main.java.com.concrete_products.CompBScreen;
import main.java.com.concrete_products.CompCScreen;
import main.java.com.factory.BaseCreator;
import main.java.com.interfaces.HardDrive;
import main.java.com.interfaces.Ram;
import main.java.com.interfaces.Screen;

import java.util.Random;

public class FactoryScreen implements BaseCreator {
    public Screen createScreen() {
        int option = new Random().nextInt(3);
        switch (option) {
            case 0:
                return new CompAScreen();
            case 1:
                return new CompBScreen();
            case 2:
                return new CompCScreen();
        }
        throw new IllegalStateException("Option not defined");
    }

    @Override
    public Ram createRam(){
        throw new  UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public HardDrive createHardDrive(){
        throw new  UnsupportedOperationException("Not supported yet.");
    }
}