package by.etc.agrandcomp.text;

public class TextLogic {

    public void addText(Text text, Sentence sentence) {
        if (text.getText() != null) {
            text.getText().add(sentence);
        }
    }
}
