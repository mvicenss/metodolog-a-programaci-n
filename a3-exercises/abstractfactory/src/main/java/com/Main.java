package abstractfactory.src.main.java.com;
import abstractfactory.src.main.java.com.comp_factories.*;
import abstractfactory.src.main.java.com.interfaces.*;

public class Main{
    public static void main(String[] args){
        //Select a concrete factory (can be changed to another) OR method to select factory through terminal can be added
        ComputerFactory factory = new ComputerAFactory();

        Ram ram = factory.createRam();
        HardDrive drive = factory.createDrive();
        Screen screen = factory.createScreen();

        System.out.println(ram);
        System.out.println(drive);
        System.out.println(screen);
    }
}
