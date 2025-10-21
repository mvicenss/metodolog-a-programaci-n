package src.main.java.com;

//NotificationService class == sends notification to client
public class NotificationService {

    private String phoneNumber = "6945138745"; //Default phone number

    public void confirmationSms(boolean isAuthorized){//The value of the argument is defined in BankFacade
        /*
                boolean isAuthorized = security.authorizeTransaction(sourceAccount, targetAccount, amount);
                *if the transaction is authorized, "isAuthorized" will be true
                ...
                notification.confirmationSms(isAuthorized);//Argument for confirmationSms is isAuthorized
         */

        if(isAuthorized){//If true
            System.out.println("SMS: Transaction completed. The confirmation SMS was sent to: " + phoneNumber);
        }else{
            System.out.println("Your trasaction couldn't be done. For more details, please contact your agent.");
        }

    }

}
