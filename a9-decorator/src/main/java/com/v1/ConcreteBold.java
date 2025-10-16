package src.main.java.com.v1;

public class ConcreteBold extends BoldDecorator{

    private TextRender concretBoldRender;

    public ConcreteBold(TextRender concretBoldRender) {
        this.concretBoldRender = concretBoldRender;
    }

    @Override
    public void renderText(String text) {
        concretBoldRender.renderText("<strong>" + text + "</strong>");
    }
}
