public class Main {
    public static void main(String[] args) throws Exception {
        
        Editor editor = new Editor(); //New Originator
        History history = new History(); //New Caretaker

        editor.type("Hello"); //Type something
        history.push(editor.save()); //Add to the stack the last Originator

        editor.type("World"); //Edit content of CURRENT object
        System.out.println(editor.getContent()); //Returns "World"

        editor.restore(history.pop()); //Via the Caretaker, take out last obj stored
        System.out.println(editor.getContent()); //Returns "Hello"


    }
}
