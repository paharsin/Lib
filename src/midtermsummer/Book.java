/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midtermsummer;

/**
 *
 * @author orlan
 */

class Book {
    private String title;
    private String author;
    private BookStatus status;

    public Book(String title, String author, BookStatus status) {
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BookStatus getStatus() {
        return status;
    }

    public boolean checkOut() {
        if (status == BookStatus.AVAILABLE) {
            status = BookStatus.CHECKED_OUT;
            return true;
        }
        return false;
    }
}