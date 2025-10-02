package abstractfactory.src.main.java.com.comp_factories;

import abstractfactory.src.main.java.com.interfaces.*;
import abstractfactory.src.main.java.com.concrete_components.*;

public class ComputerCFactory implements ComputerFactory {
    public Ram createRam(){
        return new CompCRamAbs();
    }
    public HardDrive createDrive(){
        return new CompCDriveAbs();
    }
    public Screen createScreen(){
        return new CompCScreenAbs();
    }
}
