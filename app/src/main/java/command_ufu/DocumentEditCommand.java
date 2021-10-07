package command_ufu;

public class DocumentEditCommand implements Command {

    private final Document _editableDoc;
    private final String text;

    public DocumentEditCommand(Document document, String text) {
        _editableDoc = document;
        this.text = text;
        _editableDoc.write(text);
    }


    @Override
    public void redo() {
        _editableDoc.write(text);
    }

    @Override
    public void undo() {
        _editableDoc.erase(text);
    }
}
