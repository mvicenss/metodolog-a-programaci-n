package complex_example;

import java.awt.*;

public abstract class Component {

    protected IDialogMediator mediator;
    protected String id;

    public Component(IDialogMediator mediator, String id) {
        this.mediator = mediator;
        this.id = id;
    }

    public String getId(){
        return id;
    }

    //Method for the mediator to control component
    public abstract void setEnabled(boolean enabled);

}
