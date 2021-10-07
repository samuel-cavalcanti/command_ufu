/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package command_ufu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DocumentInvokerTest {
    @Test
    void testUndoRedo() {


        String originalText = "This is the original text";
        String someOtherText = " Here is some other text.";
        String littleMoreText = " And a little more text.";
        String fullText = originalText + someOtherText + littleMoreText;

        DocumentInvoker instance = new DocumentInvoker();

        instance.write(originalText);
        instance.write(someOtherText);

        assertEquals(originalText + someOtherText, instance.toString());
        instance.undo(1);
        assertEquals(originalText, instance.toString());

        instance.redo(1);
        assertEquals(originalText + someOtherText, instance.toString());


        instance.write(littleMoreText);
        assertEquals(fullText, instance.toString());

        instance.undo(2);
        assertEquals(originalText + someOtherText, instance.toString());

        instance.redo(2);
        assertEquals(fullText, instance.toString());

        instance.undo(1);
        assertEquals(originalText + littleMoreText, instance.toString());
    }
}