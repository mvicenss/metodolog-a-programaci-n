package main.java.com.factory;
import main.java.com.interfaces.Ram;
import main.java.com.interfaces.Screen;
import main.java.com.interfaces.HardDrive;

interface  BaseCreator{
    HardDrive createHardDrive();
    Screen createScreen();
    Ram createRam();
}
