package context_example;

//Non-terminal Expression
public class Operation extends ASTNode{

    private String operation;
    private ASTNode left;
    private ASTNode right;

    public Operation(String operation, ASTNode left, ASTNode right){
        this.operation = operation;
        this.left = left;
        this.right = right;
}

@Override
public double interpret(Context context) {

    //Recursive call
    //How does it differenciate if its a number, variable or operation? --
    //if left is an instance of Number -- Number.interpret(context)
    //if left is '      '     ' Variable - Variable.interpret(context)
    //MANAGED VIA POLYMORPHISM
    double leftValue = left.interpret(context);
    double rightValue = right.interpret(context);

    // Same logic
    double result = switch (this.operation) {
        case "+" -> leftValue + rightValue;
        case "-" -> leftValue - rightValue;
        case "*" -> leftValue * rightValue;
        case "/" -> leftValue / rightValue;
        default -> 0;
    };

    return result;
}

}
