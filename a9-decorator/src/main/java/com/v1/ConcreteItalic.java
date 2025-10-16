package src.main.java.com.v1;

public class ConcreteItalic extends ItalicDecorator {

    TextRender concreteItalicRender;

    public ConcreteItalic(TextRender concreteItalicRender) {
        this.concreteItalicRender =  concreteItalicRender;
    }

    @Override
    public void renderText(String text) {
        concreteItalicRender.renderText("<i>" + text + "</i>");
    }

}
