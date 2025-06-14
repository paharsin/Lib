/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermsummer;

/**
 *
 * @author orlan
 */
class Library {
    private Book[] books;
    private int count; // Tracks number of books added

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    public boolean addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            return true;
        }
        return false;
    }

    public Book[] listBooksByStatus(BookStatus status) {
        int matchCount = 0;
        for (Book book : books) {
            if (book != null && book.getStatus() == status) {
                matchCount++;
            }
        }

        Book[] result = new Book[matchCount];
        int index = 0;
        for (Book book : books) {
            if (book != null && book.getStatus() == status) {
                result[index++] = book;
            }
        }
        return result;
    }
}

