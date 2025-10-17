package src.main.java.com.v2;

import src.main.java.com.v1.TextRender;

public class ConcreteLeft extends LeftDecorator{

    public TextRender concreteLeftRender;

    public ConcreteLeft(TextRender concreteLeftRender){
        this.concreteLeftRender =  concreteLeftRender;
    }

    @Override
    public void renderText(String text){
        int width = 80;
        int padding = width-text.length(); //80-5 = 75 spaces BEFORE word
        if(padding > 0){
            concreteLeftRender.renderText(text + " ".repeat(padding));
            //" ".repeat(padding) -- repeat(int) repepeats the prev. thing the int value
        }else{
            concreteLeftRender.renderText(text);
        }
    }

}
