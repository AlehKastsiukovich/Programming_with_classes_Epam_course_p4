package by.etc.smplclassobj.book;

public class BookShopView {

    public void printBook(Book book) {
        System.out.println("Book id: " + book.getId() + "\n"
                + "Title: " + book.getTitle() + "\n"
                + "Author: " + book.getAuthor() + "\n"
                + "Publishing house: " + book.getPubHouse() + "\n"
                + "Year of publishing: " + book.getYearOfPub() + "\n"
                + "Number of pages: " + book.getNumberOfPages() + "\n"
                + "Price: " + book.getPrice() + "\n"
                + "Type of cover: " + book.getCoverType() + "\n"
                + "-----------------------------------------------------------"
        );
    }

    public void printAllBooks(BookShop bookShop) {
        for (Book book : bookShop.getBooks()) {
            printBook(book);
        }
    }
}
