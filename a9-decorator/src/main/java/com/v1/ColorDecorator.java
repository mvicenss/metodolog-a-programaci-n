package src.main.java.com.v1;

public abstract class ColorDecorator extends TextRender{

    private TextRender colorRender;

    @Override
    public void renderText(String text) {
        colorRender.renderText(text);
    }

}
