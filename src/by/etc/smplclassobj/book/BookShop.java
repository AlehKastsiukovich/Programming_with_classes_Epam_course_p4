package by.etc.smplclassobj.book;


public class BookShop {
    private String name;
    private Book[] books = new Book[100];

    public BookShop(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
