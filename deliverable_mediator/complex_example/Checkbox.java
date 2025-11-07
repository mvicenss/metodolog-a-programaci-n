package complex_example;

public class Checkbox extends Component{

    private boolean isChecked = false;

    public Checkbox(IDialogMediator mediator, String id){
        super(mediator, id);
    }

    //Simulating user clicking
    public void setChecked(boolean isChecked){

        System.out.println("Checkbox (" + id + ") state changed to: " + isChecked);
        this.isChecked = isChecked;
        mediator.notify(this, "stateChanged");

    }

    public boolean isChecked(){
        return isChecked;
    }

    @Override
    public void setEnabled(boolean enabled){
        //Logic to enable or disable checkbox
    }
}
