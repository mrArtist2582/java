
import java.util.Scanner;

// Book class
class Book {

    final private String title;
    final private String author;
    private boolean isIssued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued successfully: " + title);
        } else {
            System.out.println("Book is already issued: " + title);
        }
    }

    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book returned successfully: " + title);
        } else {
            System.out.println("This book was not issued: " + title);
        }
    }

    public void displayBook() {
        System.out.println("Title: " + title + " by " + author + " - " + (isIssued ? "Issued" : "Available"));
    }
}

// Library class
class Library {

    final private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;

        // Adding some default books
        addBook("Java Programming", "James Gosling");
        addBook("Python Basics", "Guido van Rossum");
        addBook("Data Structures", "Robert Lafore");
    }

    final public void addBook(String title, String author) {
        if (bookCount < books.length) {
            books[bookCount++] = new Book(title, author);
            System.out.println("Book added: " + title);
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void issueBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                books[i].issueBook();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void returnBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                books[i].returnBook();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void searchBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book Found: " + books[i].getTitle() + " by " + books[i].getAuthor());
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    public void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books available in the library.");
            return;
        }
        System.out.println("\nAvailable Books:");
        for (int i = 0; i < bookCount; i++) {
            books[i].displayBook();
        }
    }
}

public class libreryManagementSystem {

    public static void main(String[] args) {
        Library library = new Library(10);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Issue a Book");
            System.out.println("2. Return a Book");
            System.out.println("3. Search a Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Add a Book");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = scanner.nextLine();
                    library.issueBook(issueTitle);
                }
                case 2 -> {
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                }
                case 3 -> {
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    library.searchBook(searchTitle);
                }
                case 4 ->
                    library.displayBooks();
                case 5 -> {
                    System.out.print("Enter book title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String newAuthor = scanner.nextLine();
                    library.addBook(newTitle, newAuthor);
                }
                case 6 -> {
                    System.out.println("Exiting Library System. Have a great day!");
                    scanner.close();
                    return;
                }
                default ->
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
