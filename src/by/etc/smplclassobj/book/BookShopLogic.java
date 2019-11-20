package by.etc.smplclassobj.book;


import java.util.ArrayList;
import java.util.List;

public class BookShopLogic {

    public void addBook(BookShop bookShop, Book book) {
        for (int i = 0; i < bookShop.getBooks().length; i++) {

            if (bookShop.getBooks()[i] == null) {
                bookShop.getBooks()[i] = book;
                break;
            }
        }
    }

    public Book findBooksByPubHouse(Book[] books, String pubHouse) {
        for (Book book : books) {

            if (book.getPubHouse().equalsIgnoreCase(pubHouse)) {
                return book;
            }
        }
        return null;
    }

    public Book findBooksByAuthor(Book[] books, String author) {
        for (Book book : books) {

            if (book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> findBooksYearsAfter(Book[] books, int year) {
        List<Book> booksYear = new ArrayList<Book>();

        for (Book book : books) {

            if (book.getYearOfPub() > year) {
                booksYear.add(book);
            }
        }
        return booksYear;
    }
}
