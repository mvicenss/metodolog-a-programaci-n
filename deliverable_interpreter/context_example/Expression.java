package context_example;

public interface Expression {

    //Now we pass the context, since each node will need it (even if its only to pass it to the children)
    public double interpret(Context context);

}
