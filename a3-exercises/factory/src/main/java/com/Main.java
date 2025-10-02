package main.java.com;

import main.java.com.factory.FactoryDrive;
import main.java.com.factory.FactoryRam;
import main.java.com.factory.FactoryScreen;
import main.java.com.interfaces.*;

public class Main {
    public static void main(String[] args) {
        FactoryRam ramFactory = new  FactoryRam();
        FactoryDrive driveFactory = new  FactoryDrive();
        FactoryScreen screenFactory = new  FactoryScreen();

        Ram ram = ramFactory.createRam();
        HardDrive drive = driveFactory.createHardDrive();
        Screen screen = screenFactory.createScreen();

        System.out.println("Computer RAM = " + ram);
        System.out.println("Computer DRIVE = " + drive);
        System.out.println("Computer SCREEN = " + screen);

    }
}
