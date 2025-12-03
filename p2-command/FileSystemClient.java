

public class FileSystemClient {
    public static void main(String[] args) {

        /*REMEMBER
        * Invoker: calls execute() method on Command class
        * Command: encapsulates the request and calls corresponding Receiver
        * Receiver: logic for executing
        * */


        //1. Who is going to do the work?? - If Windows == fs = WindowsFileSystemReceiver
        /*We do this bcos we have 2 different types*/
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //2. Client wants to open a file, so it creates corresponding command
        //openFileCommand object has stored "i have to call openFile() over fs" -- The "glue"
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        /*Preparing execution*/
        //3. File invoker get the command (to open the file) and stores it in this.command (will call execute)
        FileInvoker file = new FileInvoker(openFileCommand);

        //4.Execution order
        /*
        * 1. Client calls file.execute()
        * 2. FileInvoker calls this.command.execute()
        * 3. ConcreteCommand (OpenFileCommand) executes its own execute(), that does this.fileSystem.openFile()
        * 4. Receiver (Unix or Windows) gets openFile() and executes logic
        */
        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }

}
