//import java.awt.print.Book;

public class LibraryMain {
    public static void main(String[] args) {
        Author authorDet = new Author("J K Rowling", "jkrowling@gmail.com", 'F');

        Book book1 = new Book("Harry Potter and the Chamber of Secrets", 10, 50.22, authorDet);

        System.out.println("Book details:");
        System.out.println("Title: " + book1.getName());
        System.out.println("Author: " + book1.getAuthor().getName());
        System.out.println("Price: £" + book1.getPrice());
        System.out.println("Quantity: " + book1.getQty());
    }
}

