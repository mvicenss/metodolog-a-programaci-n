
/*ABSTRACT HANDLER*/
//
public interface DispenseChain {

    void setNextChain(DispenseChain nextChain); //Method to define next processor
    //The reference to this class is inside the argument -- method(this)
    void dispense(Currency cur); //Method to HANDLE THE REQUEST

}
