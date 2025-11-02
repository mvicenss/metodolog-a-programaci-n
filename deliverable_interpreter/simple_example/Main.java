package simple_example;

//For the simple example, we will be interpreting mathematical expressions (see AST for reference)

public class Main {

    public static void main(String[] args) {

        //(5+8)*(9-2)
        ASTNode ecuation1 = new Operation("*",
                new Operation ("+",
                        new Number (5),
                        new Number (8)),
                new Operation ("-",
                    new Number (9),
                    new Number (2))
                );

        //(39-6)/3
        ASTNode ecuation2 = new Operation("/",
                new Operation("-",
                        new Number(39),
                        new Number(6)),
                new Number(3)
        );

        System.out.println("(5+8)*(9-2)=" + ecuation1.interpret());
        System.out.println("(39-6)/3=" + ecuation2.interpret());

    }

}
