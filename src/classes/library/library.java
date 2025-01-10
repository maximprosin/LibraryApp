package classes.library;

import classes.book.book;

import java.util.ArrayList;
import java.util.List;

public class library {
    private final List<book> books;

    public library() {
        this.books = new ArrayList<>();
    }

    public void addBook(book book) {
        books.add(book);
    }

    public void removeBook(book book) {
        books.remove(book);
    }

    public void editBook(book book) {
        int index = books.indexOf(book);
        books.set(index, book);
    }

    public book findBook(String title) {
        for (classes.book.book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public List<book> listAvailableBooks() {
        List<book> availableBooks = new ArrayList<>();
        for (classes.book.book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    public List<book> listAllBooks() {
        return books;
    }
}