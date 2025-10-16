package src.main.java.com.v1;

public abstract class ItalicDecorator extends TextRender{

    private TextRender italicRender;

    @Override
    public void renderText(String text){
        italicRender.renderText(text);
    }

}
