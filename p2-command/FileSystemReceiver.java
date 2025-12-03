
/*RECEIVER -- In this case, since we have 2 different ways of handling requests, we do an interface*/
//Contract for implementation classes
public interface FileSystemReceiver {

    void openFile();
    void writeFile();
    void closeFile();

}
