package src.main.java.com.v2;

import src.main.java.com.v1.TextRender;

public abstract class LeftDecorator extends TextRender{

    private TextRender leftRender;

    @Override
    public void renderText(String text) {
        leftRender.renderText(text);
    }

}
