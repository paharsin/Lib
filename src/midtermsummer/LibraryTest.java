/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermsummer;

/**
 *
 * @author orlan
 */
public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library(3);

        // Adding books
        Book book1 = new Book("Java Basics", "John Doe", BookStatus.AVAILABLE);
        Book book2 = new Book("Advanced Java", "Jane Smith", BookStatus.CHECKED_OUT);
        library.addBook(book1);
        library.addBook(book2);

        // Testing checkout
        System.out.println("Book checkout successful: " + book1.checkOut());

        // Listing available books
        System.out.println("Available books:");
        Book[] availableBooks = library.listBooksByStatus(BookStatus.AVAILABLE);
        for (Book book : availableBooks) {
            System.out.println("Title: \"" + book.getTitle() + "\", Author: \"" + book.getAuthor() + "\"");
        }
    }
}
