package command_ufu;

import java.util.ArrayList;
import java.util.List;

public class Document {

    private final List<String> _text = new ArrayList<>();

    public void write(String text) {
        _text.add(text);
    }

    public void erase(String text) {
        _text.remove(text);
    }

    public void erase(int textLevel) {
        _text.remove(textLevel);
    }

    @Override
    public String toString() {
        return _text.stream().reduce("", (a, b) -> a + b);
    }

    public String read() {
        return _text.stream().reduce("", (a, b) -> a + b);
    }
}
