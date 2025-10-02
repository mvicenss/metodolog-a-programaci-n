package main.java.com.concrete_products;
import  main.java.com.interfaces.Screen;

public class CompCScreen implements Screen {
    public void screenQuality(){
        System.out.println("Computer C Screen = UHD");
    }

    @Override
    public String toString(){
        return "Computer C Screen = UHD";
    }
}
