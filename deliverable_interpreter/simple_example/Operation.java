package simple_example;

/*Non Terminal Expression (+,-,*,/)

This class also "creates" the non-terminal nodes of an AST

*/
class Operation extends ASTNode{

    String operation;

    //There will be 2 "subtrees", one to the right and one to the left (therefore the datatype)
    ASTNode right;
    ASTNode left;

    //Any instance of this class (as it isn't a "terminal symbol") MUST have something to its right and left
    public Operation(String operation, ASTNode left, ASTNode right){
        this.operation = operation;
        this.left = left;
        this.right = right;

    }

    @Override
    public double interpret(){

        //If the next node is an instance of Number -> Number.interpret() -- else do Operation.interpret
        //Both are linked via ASTNode
        double leftValue = left.interpret();
        double rightValue = right.interpret();

        String operation;

        //Enhanced switch
        double result = switch (this.operation){
            case "+" -> leftValue + rightValue;
            case "-" -> leftValue - rightValue;
            case "*" -> leftValue * rightValue;
            case "/" -> leftValue / rightValue;
            default -> 0;
        };

        return result;
    }

}
