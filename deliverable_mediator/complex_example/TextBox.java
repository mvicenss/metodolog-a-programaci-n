package complex_example;

public class TextBox extends Component{

    private String text = "";

    public TextBox(IDialogMediator mediator, String id){
        super(mediator, id);
    }

    public void setText(String text){
        System.out.println("TextBox (" + id + ") text changed to: '" + text + "'");
        this.text = text;
        mediator.notify(this,"textChanged");
    }

    public String getText(){
        return text;
    }

    @Override
    public void setEnabled(boolean enabled){
        //logic to enable/disable the textbox
    }
}
