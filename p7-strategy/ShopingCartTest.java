public class ShopingCartTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(); //Context object

        //Generate items
        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        //Add items to cart/Context
        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
    }

}
