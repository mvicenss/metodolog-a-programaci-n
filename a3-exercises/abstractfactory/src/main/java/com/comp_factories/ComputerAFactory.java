package abstractfactory.src.main.java.com.comp_factories;

import abstractfactory.src.main.java.com.concrete_components.*;
import abstractfactory.src.main.java.com.interfaces.*;

public class ComputerAFactory implements ComputerFactory {
    public Ram createRam(){
        return new CompARamAbs();
    }
    public HardDrive createDrive(){
        return new ComADriveAbs();
    }
    public Screen createScreen(){
        return new CompAScreenAbs();
    }
}
