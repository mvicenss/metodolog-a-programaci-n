
/// Memento
public class EditorMemento {

    private final String content;

    //SetState
    public EditorMemento(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return content;
    }
}
