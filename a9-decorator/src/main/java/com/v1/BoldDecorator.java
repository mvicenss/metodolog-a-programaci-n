package src.main.java.com.v1;

public abstract class BoldDecorator extends  TextRender {

    private TextRender boldRender;

    @Override
    public void renderText(String text) {
        boldRender.renderText(text); //Delegates the method to the Deorated object (will have more methods/functions)
    }

}
