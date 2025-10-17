package src.main.java.com.v2;

import src.main.java.com.v1.TextRender;

public abstract class CenterDecorator extends TextRender{

    private TextRender centerRender;

    @Override
    public void renderText(String text){
        centerRender.renderText(text);
    }

}
