package com.libraryapp;


import com.libraryapp.classes.*;

public class MockData {
    public static Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", "978-0-06-112008-4", true);
    public static Book book2 = new Book("1984", "George Orwell", "Dystopian", "978-0-452-28423-4", true);
    public static Book book3 = new Book("Pride and Prejudice", "No Author", "Romance", "978-0-19-953556-9", true);
    public static Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", "978-0-7432-7356-5", true);
    public static Book book5 = new Book("Moby Dick", "Herman Melville", "Adventure", "978-0-14-243724-7", true);
    public static Book book6 = new Book("War and Peace", "Leo Tolstoy", "Historical Fiction", "978-0-14-303999-0", false);
    public static Book book7 = new Book("No Title", "J.D. Salinger", "Fiction", "978-0-31676948-0", true);
    public static Book book8 = new Book("The Hobbit", "J.R.R. Tolkien", "No Genre", "978-0-61800221-3", true);
    public static Book book9 = new Book("Fahrenheit 451", "Ray Bradbury", "Dystopian", "978-1-4516-7331-9", false);
    public static Book book10 = new Book("Brave New World", "Aldous Huxley", "Dystopian", "978-0-06-085052-4", true);

    public static Library library = new Library();

    public static Reader reader1 = new Reader("Jack", "jack12@mail.ru", "123");
    public static Reader reader2 = new Reader("Mark", "mark111@google.com", "12345");
    public static Reader reader3 = new Reader("Jane", "jane33@google.com", "11111");
    public static Librarian librarian1 = new Librarian("Tom", "tom1@google.com", "111", library);
    public static Admin admin1 = new Admin("Maxim", "maximprosin647@google.com", "12345");
}
