package abstractfactory.src.main.java.com.concrete_components;

import abstractfactory.src.main.java.com.interfaces.Screen;

public class CompCScreenAbs implements Screen {
    @Override
    public void screenQuality(){
        System.out.println(this.toString());
    }

    public String toString(){
        return "Computer C Screen = UHD";
    }
}
