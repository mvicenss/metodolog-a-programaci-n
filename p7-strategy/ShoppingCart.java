import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


//Context class -- Uses Strategy
public class ShoppingCart {

    //List of items
    List<Item> items;

    public ShoppingCart(){
        this.items=new ArrayList<Item>(); //Initialize as an ArrayList
    }

    //Add item to List
    public void addItem(Item item){
        this.items.add(item);
    }

    //remove from list
    public void removeItem(Item item){
        this.items.remove(item);
    }

    //Calc. total of the cart
    public int calculateTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    //Strategy usage + Reference
    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal(); //Calculate the total of the cart
        paymentMethod.pay(amount); //Call corresponding payment method
    }

}
