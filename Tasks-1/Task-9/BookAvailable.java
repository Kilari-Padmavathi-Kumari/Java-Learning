class Book {
    String title;
    static int availableBooks = 0;            // static variable

    void Book(String title) {
        this.title = title;
        availableBooks++;  // count increases when a book is added
    }

    static void showAvailableBooks() {
        System.out.println("Available books: " + availableBooks);
    }
}

public class BookAvailable {
    public static void main(String[] args) {
        Book b1 = new Book();
       Book b2 = new Book();
       Book b3 = new Book();
       b1.Book("java");
       b2.Book("python");
       b3.Book("c");
        Book.showAvailableBooks();  // shows 3

    }
}
