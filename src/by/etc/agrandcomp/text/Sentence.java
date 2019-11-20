package by.etc.agrandcomp.text;


import java.util.List;

public class Sentence {
    private List<Word> words;

    public Sentence(List<Word> words) {
        this.words = words;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Word word : words) {
            sb.append(word.toString() + " ");
        }

        return sb.toString();
    }
}
