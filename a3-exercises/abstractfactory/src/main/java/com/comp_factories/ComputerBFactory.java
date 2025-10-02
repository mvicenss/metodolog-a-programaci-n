package abstractfactory.src.main.java.com.comp_factories;

import abstractfactory.src.main.java.com.concrete_components.CompBDriveAbs;
import abstractfactory.src.main.java.com.concrete_components.CompBRamAbs;
import abstractfactory.src.main.java.com.concrete_components.CompBScreenAbs;
import abstractfactory.src.main.java.com.interfaces.*;

public class ComputerBFactory implements ComputerFactory {
    public Ram createRam(){
        return new CompBRamAbs();
    }
    public HardDrive createDrive(){
        return new CompBDriveAbs();
    }
    public Screen createScreen(){
        return new CompBScreenAbs();
    }
}
