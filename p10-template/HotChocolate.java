public class HotChocolate extends HotBeverage {

    private final boolean withToppings;

    public HotChocolate(boolean withToppings) {
        this.withToppings = withToppings;
    }

    @Override
    protected void brew() {
        System.out.println("Mixing the hot chocolate powder");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding marshmallows and whipped cream");
    }

    @Override
    protected boolean wantsCondiments() {
        return withToppings;
    }

   
}
