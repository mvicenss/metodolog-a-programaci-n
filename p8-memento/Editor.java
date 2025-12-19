
// Originator -- Object that we want to clone
public class Editor {

    private String content = ""; 


    public void type(String words) {
        content += words;
    }

    //Create a new memento
    public EditowrMemento save() {
        return new EditorMemento(content);
    }

    //Get content of previous object
    public void restore(EditorMemento memento) {
        content = memento.getContent();
    }

    //Get content of current obj.
    public String getContent() {
        return content;
    }
}
