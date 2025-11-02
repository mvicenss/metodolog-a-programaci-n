package simple_example;

//Class for terminal numbers + Terminal Nodes on an AST
class Number extends ASTNode{

    int value; //the value of each terminal instance is saved here

    //Any instance of this class must have a value
    public Number(int value){
        this.value = value;
    }

    //We can use this method because: Expression -> AST -> Number/Operation
    @Override
    public double interpret(){
        return value;
    }
}
