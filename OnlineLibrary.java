class Library {
    String[] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    void showAvailableBooks() {
        System.out.println("Available books are:");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issuedBooks(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == book) {
                System.out.println("this book has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("this book does not exist");
    }

    void returnBook(String book) {
        for (int i = 0; i < books.length; i++) {
            if (this.books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }
}

public class OnlineLibrary {
    public static void main(String[] args) {
        // you have to implement a library using java class library
        // mehods issuebook , return book
        // properties : array to store the availabel books
        // array to store the issued books
        Library centralLibrary = new Library();
        centralLibrary.addBook("the rising sun");
        centralLibrary.addBook("1857");
        centralLibrary.addBook("the final choice");
        centralLibrary.showAvailableBooks();
        centralLibrary.issuedBooks("1857");
        centralLibrary.issuedBooks("1857");
        centralLibrary.returnBook("1857");
        centralLibrary.returnBook("The prophecy");
        centralLibrary.showAvailableBooks();
    }
}
