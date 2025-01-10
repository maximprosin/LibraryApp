package main.java.com.libraryapp.tests;

import main.java.com.libraryapp.classes.*;

public class datatest {
    public static book book1 = new book("To Kill a Mockingbird", "Harper Lee", "Fiction", "978-0-06-112008-4", true);
    public static book book2 = new book("1984", "George Orwell", "Dystopian", "978-0-452-28423-4", true);
    public static book book3 = new book("Pride and Prejudice", "No Author", "Romance", "978-0-19-953556-9", true);
    public static book book4 = new book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", "978-0-7432-7356-5", true);
    public static book book5 = new book("Moby Dick", "Herman Melville", "Adventure", "978-0-14-243724-7", true);
    public static book book6 = new book("War and Peace", "Leo Tolstoy", "Historical Fiction", "978-0-14-303999-0", false);
    public static book book7 = new book("No Title", "J.D. Salinger", "Fiction", "978-0-31676948-0", true);
    public static book book8 = new book("The Hobbit", "J.R.R. Tolkien", "No Genre", "978-0-61800221-3", true);
    public static book book9 = new book("Fahrenheit 451", "Ray Bradbury", "Dystopian", "978-1-4516-7331-9", false);
    public static book book10 = new book("Brave New World", "Aldous Huxley", "Dystopian", "978-0-06-085052-4", true);

    public static main.java.com.libraryapp.classes.library library = new library();

    public static reader reader1 = new reader("Jack", "jack12@mail.ru", "123");
    public static reader reader2 = new reader("Mark", "mark111@google.com", "12345");
    public static reader reader3 = new reader("Jane", "jane33@google.com", "11111");
    public static librarian librarian1 = new librarian("Tom", "tom1@google.com", "111", library);
    public static admin admin1 = new admin("Maxim", "maximprosin647@google.com", "12345");
}
