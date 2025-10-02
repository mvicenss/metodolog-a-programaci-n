package abstractfactory.src.main.java.com.interfaces;

//Abstract factory interface = methods to create each component
public interface ComputerFactory {
    Ram createRam();
    HardDrive createDrive();
    Screen createScreen();
}
