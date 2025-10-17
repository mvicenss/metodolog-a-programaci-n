package src.main.java.com.v2;

import src.main.java.com.v1.TextRender;
//import org.jline.terminal.Terminal;
//import org.jline.terminal.TerminalBuilder;

public class ConcreteCenter extends CenterDecorator{

    private TextRender concreteCenterRender;

    public ConcreteCenter(TextRender concreteCenterRender){
        this.concreteCenterRender = concreteCenterRender;
    }

    @Override
    public void renderText(String text){

        int width = 80; //default width of terminal (total)
        int padding = (width-text.length())/2; //How many spaces have to appear BEFORE text (half of it)
        if(padding > 0){
            concreteCenterRender.renderText(" ".repeat(padding) + text);
        }else{
            concreteCenterRender.renderText(text);
        }

        /*try {
            Terminal terminal = TerminalBuilder.terminal();
            int width = terminal.getWidth();
            int padding = (witdh - text.length()) / 2;
            if (padding > 0) {
                concreteCenterRender.renderText(" ".repeat(padding) + text);
            } else {
                concreteCenterRender.renderText(text);
            }
        }catch(Exception e){
            System.out.println(text);
        }
        */

    }

}
