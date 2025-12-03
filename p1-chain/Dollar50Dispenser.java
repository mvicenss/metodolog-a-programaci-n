public class Dollar50Dispenser implements DispenseChain{

    private DispenseChain chain; //Reference to parent class (allows pointng to any Conc.Handler)

    @Override //HOW HANDLERS ARE LINKED -- LINKS SET IN MAIN
    public void setNextChain(DispenseChain nextChain) { //Stores reference to next
        this.chain=nextChain; //Gets nextChain (arg) and assigns it to this.chain (used in method below)
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 50){ //If the amount matches the value of the bill
            int num = cur.getAmount()/50; //How many bills to give
            int remainder = cur.getAmount() % 50; //Reminder (can't be given in 50's)
            System.out.println("Dispensing "+num+" 50$ note");
            if(remainder !=0) this.chain.dispense(new Currency(remainder)); //If there is money left, delegate to next handler
        }else{
            this.chain.dispense(cur); //Delegate directly (value can't be "broken down")
        }
    }

}
