package by.etc.smplclassobj.book;


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

public class Main {

    public static void main(String[] args) {
        BookShop bookShop = new BookShop("Druk");
        BookShopLogic logic = new BookShopLogic();
        BookShopView view = new BookShopView();

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

        Book book1 = new Book(
                2,
                "Book test",
                "Some guy",
                "Star",
                2015,
                100,
                115,
                "Hard cover"
        );

        logic.addBook(bookShop, book);
        logic.addBook(bookShop, book1);

        view.printAllBooks(bookShop);
    }
}
