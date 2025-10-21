package src.main.java.com;

//Account class == Actual money transfer
public class Account{

    private float balance = 10000000; //Account balance (set here to simplify process)

    public void moneyTransfer(float amount, String targetAccount){

        if(balance >= amount){ //If there is enough money:
            System.out.println("You have successfully transferred $" + amount +  " to: " + targetAccount);
            balance -= amount; //Update the new balance
        }else{
            System.out.println("You don't have enough money");
        }

    }

}