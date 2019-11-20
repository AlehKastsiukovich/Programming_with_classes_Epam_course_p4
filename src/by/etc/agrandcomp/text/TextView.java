package by.etc.agrandcomp.text;

public class TextView {

    public void printText(Text text) {
        for (Sentence sentence : text.getText()) {
            System.out.println(sentence.toString());
        }
    }

    public void printTitle(Text text) {
        System.out.println(text.getTitle());
    }
}
