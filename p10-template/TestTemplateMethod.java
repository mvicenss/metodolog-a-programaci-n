public class TestTemplateMethod {
    public static void main(String[] args) {

        HotBeverage tea = new Tea();
        HotBeverage coffee = new Coffee();
        HotBeverage chocoWithoutToppings = new HotChocolate(false);
        HotBeverage chocoWithToppings = new HotChocolate(true);

        System.out.println("=== Preparing Tea ===");
        tea.prepareRecipe();

        System.out.println("=== Preparing Coffee ===");
        coffee.prepareRecipe();

        System.out.println("=== Preparing Hot Chocolate (no toppings) ===");
        chocoWithoutToppings.prepareRecipe();

        System.out.println("=== Preparing Hot Chocolate (with toppings) ===");
        chocoWithToppings.prepareRecipe();
    }
}