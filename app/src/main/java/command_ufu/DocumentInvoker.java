package command_ufu;


import java.util.ArrayList;
import java.util.List;

public class DocumentInvoker {

    private final Document document = new Document();
    private final List<Command> commands = new ArrayList<>();

    public DocumentInvoker() {

    }

    public void write(String text) {

        DocumentEditCommand command = new DocumentEditCommand(document, text);
        commands.add(command);
    }

    public void undo(int i) {
        commands.get(i).undo();
    }

    public void redo(int i) {
        commands.get(i).redo();
    }

    public String readDocument(){
      return   document.read();
    }
}
