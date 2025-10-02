package main.java.com.concrete_products;
import main.java.com.interfaces.Screen;

public class CompAScreen implements Screen{
    public void screenQuality(){
        System.out.println("Computer A Screen = SD");
    }

    @Override
    public String toString(){
        return "Computer A Screen = SD";
    }
}