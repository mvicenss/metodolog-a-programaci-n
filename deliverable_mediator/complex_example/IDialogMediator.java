package complex_example;

//Mediator interface -- Defines how components "speak" to the Mediator
public interface IDialogMediator{

    void notify(Component remitent, String event);

}
