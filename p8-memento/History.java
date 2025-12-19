import java.util.Stack;

// Caretaker -- Keeps mementos
public class History {

    private final Stack<EditorMemento> history = new Stack<>(); //Mementos stored here

    public void push(EditorMemento state) {
        history.push(state);
    } //store

    public EditorMemento pop() {
        return history.pop();
    } //reverse -- Returns an instance of a Memento
    
}
