package src.main.java.com;

//FACADE CLASS
public class BankFacade {

    //References to objets of each class
    private Card card;
    private Account account;
    private SecuritySystem security;
    private NotificationService notification;

    public BankFacade(Card card, Account account, SecuritySystem security, NotificationService notification) {
        this.card = card;
        this.account = account;
        this.security = security;
        this.notification = notification;
    }


    //Method Main/ATM will use (everything is implemented here)
    public void transfer(String inputPin, float amount, String targetAccount){

            String sourceAccount = "ES88 3017 5120 15 9876543210";

            try{
                //Assign value to isAuthorized -- confirmationSms depends on this value to execute
                boolean isAuthorized = security.authorizeTransaction(sourceAccount, targetAccount, amount);
                if (isAuthorized) {//If the result of authorizeTransaction with the given parameters is TRUE
                    account.moneyTransfer(amount, targetAccount);
                    notification.confirmationSms(true);
                }
            }catch(SecurityException e){
                notification.confirmationSms(false);
                System.out.println(e.getMessage());
            }
    }



}
