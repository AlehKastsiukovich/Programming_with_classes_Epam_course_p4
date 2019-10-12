package by.etc.pwc.agregandcomp.text;

public class Sentence {
    private String sentence;

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public void addWord(Word word) {
        sentence += " " + word.getWord();
    }
}
