package by.etc.pwc.simpleclassandobj.book;


import java.util.Scanner;

public class BookShop {
    private Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void findBooksByPubHouse() {
        Scanner scanner = new Scanner(System.in);
        String scanPubHouse = null;

        System.out.println("\n"+ "Enter the publishing house of the book: ");
        scanPubHouse = scanner.nextLine();

        for(Book ser : books) {
            if(ser.getPubHouse().equalsIgnoreCase(scanPubHouse)) {
                System.out.println(ser.toString());
            } else {
                System.out.println("The bookshop does not have books of this publishing house.");
            }
        }
    }

    public void findBooksByAuthor() {
        Scanner scanner = new Scanner(System.in);
        String scanAuthor = null;

        System.out.println("\n"+ "Enter the author of the book: ");
        scanAuthor = scanner.nextLine();

        for(Book ser : books) {
            if(ser.getAuthor().equalsIgnoreCase(scanAuthor)) {
                System.out.println(ser.toString());
            } else {
                System.out.println("The bookshop does not have books of this author.");
            }
        }
    }

    public void findBooksYearsAfter() {
        Scanner scanner = new Scanner(System.in);
        int scanYear;

        System.out.println("\n"+ "Enter the year: ");
        scanYear = scanner.nextInt();

        for(Book ser : books) {
            if(ser.getYearOfPub() > scanYear ) {
                System.out.println(ser.toString());
            } else {
                System.out.println("List of books after " + scanYear + ": ");
            }
        }
    }
}
