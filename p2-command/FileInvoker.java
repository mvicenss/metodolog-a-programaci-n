public class FileInvoker {

    public Command command; //Reference to Command (the superclass/parent class)

    public FileInvoker(Command c){
        this.command=c; //assign command obj to var c
    }

    public void execute(){
        this.command.execute(); //execute corresponding method carrier
    }

}
