package by.etc.agrandcomp.text;


import java.util.ArrayList;
import java.util.List;

/**
 * Создать объект класса текст, использую классы Предложение, Слово. Методы: дополнить текст
 * вывести на консоль текст, заголовок текста.
 */

public class Main {

    public static void main(String[] args) {
        Word w1 = new Word("Hello");
        Word w2 = new Word("My");
        Word w3 = new Word("Friend");
        Text text = new Text();
        TextLogic logic = new TextLogic();
        TextView view = new TextView();

        List<Word> words = new ArrayList<Word>();

        words.add(w1);
        words.add(w2);
        words.add(w3);

        Sentence sentence = new Sentence(words);

        List<Sentence> sentences = new ArrayList<Sentence>();
        sentences.add(sentence);

        text.setText(sentences);
        view.printText(text);

        logic.addText(text, sentence);
        view.printText(text);
    }
}
