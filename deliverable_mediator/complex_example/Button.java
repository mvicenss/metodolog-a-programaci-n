package complex_example;

public class Button extends Component {

    private boolean isEnabled = false;

    public Button(IDialogMediator mediator, String id) {
        super(mediator, id);
    }

    // Simulates the user clicking
    public void click() {
        if (this.isEnabled) {
            System.out.println("Button (" + id + ") was clicked.");
            // Notify the mediator it was clicked
            mediator.notify(this, "click");
        } else {
            System.out.println("Button (" + id + ") clicked, but it is disabled.");
        }
    }

    //EXPLAIN THIS
    @Override
    public void setEnabled(boolean enabled) {
        this.isEnabled = enabled;
        System.out.println(">> Mediator orders: Button (" + id + ") is now " + (enabled ? "ENABLED" : "DISABLED"));
    }
}
