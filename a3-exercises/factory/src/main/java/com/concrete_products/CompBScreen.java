package main.java.com.concrete_products;
import main.java.com.interfaces.Screen;

public class CompBScreen implements Screen {
    public void screenQuality(){
        System.out.println("Computer B Screen =  FHD");
    }

    @Override
    public String toString(){
        return "Computer B Screen = FHD";
    }
}
