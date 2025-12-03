public class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystem; //Reference to the Receiver (in this case, since we have 2 ways of handling requests, we reference to the parent class)

    //FileSystemReceiver will be an object (hence the encapsulation) of a certain OS
    public OpenFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        //open command is forwarding request to openFile method
        this.fileSystem.openFile(); //Calls corresponding openFile method depending on OS

        //When calling obj.execute(), the Command links the
    }

}
