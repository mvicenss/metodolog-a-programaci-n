package src.main.java.com.v1;

import java.awt.*;

public class ConcreteColor extends ColorDecorator {

    private TextRender concreteColorRender;

    public ConcreteColor(TextRender concreteColorRender) {
        this.concreteColorRender = concreteColorRender;
    }

    @Override
    public void renderText(String text){
        concreteColorRender.renderText("<colored color=red>" + text + "</colored>");
    }

}
