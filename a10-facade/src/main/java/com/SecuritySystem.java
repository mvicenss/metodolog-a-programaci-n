package src.main.java.com;

//SecuritySystem class == Cheking if the transaction may be fraudulent
public class SecuritySystem{

    public boolean authorizeTransaction(String sourceAccount, String targetAccount, float amount){

        boolean safeTransaccion = verifySafety(amount);

        if(safeTransaccion){ //safeTransacion = true;
            System.out.println("Authorizing transaction from " + sourceAccount + " to " + targetAccount + " of a total of: $" + amount);
            System.out.println("Transaction authorized");
            return true;
        }else{
            System.out.println("Transaction denied due to security reasons. Please contact one of our agents");
            throw new SecurityException("Fraudulent transaccion detected"); //Invalid transaccion error handling
        }

    }

    //Check if the amount to transfer is UNDER 1 MILLION
    private boolean verifySafety(float amount){
        return amount < 1000000; //return true if this happens, false otherwise
    }

}