package context_example;

public class Variable extends ASTNode {

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    //Node asks Context for the value of the current variable
    @Override
    public double interpret(Context context) {
        return context.getValue(this.name); //retrieve value of the variable a, b, c, etc...
    }

}
