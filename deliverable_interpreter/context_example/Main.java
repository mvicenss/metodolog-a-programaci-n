package context_example;

public class Main {

    public static void main(String[] args) {

        //Creating context variable values
        Context context = new Context();
        context.setValue("a", 5.0);
        context.setValue("b", 8.0);
        context.setValue("c", 9.0);
        context.setValue("d", 2.0);

        //Building tree that uses variables
        //(a+b)*(c-d)
        ASTNode ecuation1 = new Operation("*",
                new Operation("+",
                        new Variable("a"),
                        new Variable("b")
                ),
                new Operation("-",
                        new Variable("c"),
                        new Variable("d")
                )
        );

        //Mixed expressions
        ASTNode ecuation2 = new Operation("/",
                new Operation("-",
                        new Number(39),
                        new Number(6)
                ),
                new Variable("a")
        );

        //Interpret using Context
        System.out.println("(a + b) * (c - d) = " + ecuation1.interpret(context));
        System.out.println("(39 - 6) / a = " + ecuation2.interpret(context));
    }
}
