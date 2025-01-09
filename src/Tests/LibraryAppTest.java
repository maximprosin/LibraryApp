package Tests;

import Classes.*;

public class LibraryAppTest {
    public static void mainTest() {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", "978-0-06-112008-4", true);
        Book book2 = new Book("1984", "George Orwell", "Dystopian", "978-0-452-28423-4", true);
        Book book3 = new Book("Pride and Prejudice", "No Author", "Romance", "978-0-19-953556-9", true);
        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", "978-0-7432-7356-5", true);
        Book book5 = new Book("Moby Dick", "Herman Melville", "Adventure", "978-0-14-243724-7", true);
        Book book6 = new Book("War and Peace", "Leo Tolstoy", "Historical Fiction", "978-0-14-303999-0", false);
        Book book7 = new Book("No Title", "J.D. Salinger", "Fiction", "978-0-31676948-0", true);
        Book book8 = new Book("The Hobbit", "J.R.R. Tolkien", "No Genre", "978-0-61800221-3", true);
        Book book9 = new Book("Fahrenheit 451", "Ray Bradbury", "Dystopian", "978-1-4516-7331-9", false);
        Book book10 = new Book("Brave New World", "Aldous Huxley", "Dystopian", "978-0-06-085052-4", true);

        Library library = new Library();

        Reader reader1 = new Reader("Jack", "jack12@mail.ru", "123");
        Reader reader2 = new Reader("Mark", "mark111@google.com", "12345");
        Reader reader3 = new Reader("Jane", "jane33@google.com", "11111");
        Librarian librarian1 = new Librarian("Tom", "tom1@google.com", "111", library);
        Admin admin1 = new Admin("Maxim", "maximprosin647@google.com", "12345");

        admin1.login("maximprosin647@google.com", "12345");

        if (admin1.isLoggedIn()) {
            admin1.addUser(reader1);
            admin1.addUser(reader2);
            admin1.addUser(reader3);

            admin1.listUsers();

            admin1.logout();
        } else {
            System.out.println("Извините, но ваши данные не совпадают, попробуйте еще раз");
        }

        librarian1.login("tom1@google.com", "111");

        if (librarian1.isLoggedIn()) {
            librarian1.addBook(book1);
            librarian1.addBook(book2);
            librarian1.addBook(book3);
            librarian1.addBook(book4);
            librarian1.addBook(book5);
            librarian1.addBook(book6);
            librarian1.addBook(book7);
            librarian1.addBook(book8);
            librarian1.addBook(book9);
            librarian1.addBook(book10);

            library.listAllBooks();

            book3.setAuthor("Jane Austen");
            book7.setTitle("The Catcher in the Rye");
            book8.setGenre("Fantasy");

            librarian1.editBook(book3);
            librarian1.editBook(book7);
            librarian1.editBook(book8);

            library.listAllBooks();

            librarian1.removeBook(book10);

            library.listAllBooks();

            librarian1.logout();
        } else {
            System.out.println("Извините, но ваши данные не совпадают, попробуйте еще раз");
        }

        reader1.login("jack12@mail.ru", "123");

        if (reader1.isLoggedIn()) {
            library.listAvailableBooks();

            reader1.borrowBook(book2);
            reader1.borrowBook(book3);
            reader1.borrowBook(book6);

            reader1.viewHistory();

            reader1.returnBook(book2);

            reader1.viewHistory();

            reader1.logout();
        } else {
            System.out.println("Извините, но ваши данные не совпадают, попробуйте еще раз");
        }

        reader2.login("mark111@google.com", "12345");

        if (reader2.isLoggedIn()) {
            library.listAvailableBooks();

            reader2.borrowBook(book1);
            reader2.borrowBook(book5);
            reader2.borrowBook(book7);

            reader2.viewHistory();

            reader2.returnBook(book4);
            reader2.returnBook(book5);

            reader2.viewHistory();

            reader2.logout();
        } else {
            System.out.println("Извините, но ваши данные не совпадают, попробуйте еще раз");
        }

        reader3.login("jane33@google.com", "11111");

        if (reader3.isLoggedIn()) {
            library.listAvailableBooks();

            reader3.borrowBook(book3);
            reader3.borrowBook(book5);
            reader3.borrowBook(book7);

            reader3.viewHistory();

            reader3.logout();
        } else {
            System.out.println("Извините, но ваши данные не совпадают, попробуйте еще раз");
        }
    }
}
