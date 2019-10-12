package by.etc.pwc.simpleclassandobj.book;


import java.util.ArrayList;
import java.util.List;

/**
 * Создать класс Book. Определить конструкторы, set и get методы и метод toString.
 * Создать второй класс, агрегирующий массив типа Book, c подходящими конструкторами
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, авторы, издательство, год издания, количество страниць, цена, тип переплета.
 * Вывести:
 * -список книг заданного автора
 * -список книг, выпущенных заданным издательством
 * -список книг, выпущенных после заданного года.
 */

public class Book {
    private int id;
    private String title;
    private String author;
    private String pubHouse;
    private int yearOfPub;
    private int numberOfPages;
    private int price;
    private String coverType;

    public Book(int id, String title, String author, String pubHouse, int yearOfPub, int numberOfPages, int price, String coverType) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pubHouse = pubHouse;
        this.yearOfPub = yearOfPub;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.coverType = coverType;
    }

    public String toString() {
        return    "Book id: " + id + "\n"
                + "Title: " + title + "\n"
                + "Author: " + author + "\n"
                + "Publishing house: " + pubHouse + "\n"
                + "Year of publishing: " + yearOfPub + "\n"
                + "Number of pages: " + numberOfPages + "\n"
                + "Price: " + price + "\n"
                + "Type of cover: " + coverType +"\n"
                +"-----------------------------------------------------------";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPubHouse() {
        return pubHouse;
    }

    public void setPubHouse(String pubHouse) {
        this.pubHouse = pubHouse;
    }

    public int getYearOfPub() {
        return yearOfPub;
    }

    public void setYearOfPub(int yearOfPub) {
        this.yearOfPub = yearOfPub;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        Book book = new Book(
                1,
                "Book of knowledge",
                "Me",
                "MyHouse",
                2019,
                666,
                1,
                "Hard cover"
        );

        bookList.add(book);

        BookShop bookShop = new BookShop();
        Book[] books = bookList.toArray( new Book[0]);

        bookShop.setBooks(books);
        //bookShop.findBooksByAuthor();
        bookShop.findBooksByPubHouse();
        //bookShop.findBooksYearsAfter();
    }
}
