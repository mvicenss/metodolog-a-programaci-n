package src.main.java.com.v2;

import com.sun.source.doctree.TextTree;
import src.main.java.com.v1.TextRender;

public abstract class RightDecorator extends TextRender {

    TextRender rightRender;

    @Override
    public void renderText(String text) {
        rightRender.renderText(text);
    }

}
