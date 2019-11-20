package by.etc.agrandcomp.text;


import java.util.List;

public class Text {
   private List<Sentence> text;
   private Sentence title;

   public Sentence getTitle() {
       return title;
   }

   public List<Sentence> getText() {
       return text;
   }

    public void setText(List<Sentence> text) {
        this.text = text;
    }

    public void setTitle(Sentence title) {
        this.title = title;
    }
}
