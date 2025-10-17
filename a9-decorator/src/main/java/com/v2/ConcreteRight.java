package src.main.java.com.v2;

import src.main.java.com.v1.TextRender;

public class ConcreteRight extends TextRender {

    private TextRender concreteRigthRender;

    public ConcreteRight(TextRender concreteRigthRender) {
        this.concreteRigthRender = concreteRigthRender;
    }

    @Override
    public void renderText(String text){
        int width = 80;
        int padding = width-text.length();
        if(padding > 0){
            concreteRigthRender.renderText(" ".repeat(padding) + text);
        }else{
            concreteRigthRender.renderText(text);
        }
    }
}
