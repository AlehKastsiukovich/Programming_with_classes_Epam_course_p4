package by.etc.pwc.agregandcomp.text;


/**
 * Создать объект класса текст, использую классы Предложение, Слово. Методы: дополнить текст
 * вывести на консоль текст, заголовок текста.
 */

public class Text {
    private String title;
    private String body;

    public Text(Word word) {
        title = word.getWord();
    }

    public Text(Sentence sentence) {
        title = sentence.getSentence();
    }

    public void addText(Word word) {
        if(body != null) {
            body += " " + word.getWord();
        } else {
            body = word.getWord();
        }
    }

    public void addText(Sentence sentence) {
        body += " " + sentence.getSentence();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void showBody() {
        System.out.println(body);
    }

    public void showTitle() {
        System.out.println(title);
    }

    public static void main(String[] args) {
        Word word1 = new Word("hello");
        Word word2 = new Word("world");
        Word word3 = new Word("!");
        Text text = new Text(word1);
        text.addText(word2);
        text.addText(word3);

        text.showBody();
        text.showTitle();
    }
}
