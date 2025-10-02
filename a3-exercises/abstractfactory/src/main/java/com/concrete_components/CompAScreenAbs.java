package abstractfactory.src.main.java.com.concrete_components;

import abstractfactory.src.main.java.com.interfaces.Screen;

public class CompAScreenAbs implements Screen {

    @Override
    public void screenQuality(){
        System.out.println(this.toString());
    }

    public String toString(){
        return "Computer A Screen = SD";
    }
}
