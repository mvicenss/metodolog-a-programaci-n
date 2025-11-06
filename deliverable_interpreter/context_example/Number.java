package context_example;

//Terminal Expression Type 1
public class Number extends ASTNode{

    private double value;

    public Number(double value) {
        this.value = value;
    }

    // A literal number doesn't need the Context, so we just pass its value
    @Override
    public double interpret(Context context) {
        return value;
    }

}
