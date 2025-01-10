package classes.users;

import classes.book.book;

public class librarian extends user {
    private classes.library.library library;

    public librarian(String name, String email, String password, classes.library.library library) {
        super(name, email, password);
        this.library = library;
    }

    public void addBook(book book) {
        library.addBook(book);
        System.out.println("Книга " + book.getTitle() + " была добавлена на полку");
    }

    public void removeBook(book book) {
        library.removeBook(book);
        System.out.println("Книга " + book.getTitle() + " была убрана с полки");
    }

    public void editBook(book book) {
        library.editBook(book);
        System.out.println("Книга " + book.getTitle() + " была отредактирована и возвращена на полку");
    }

    @Override
    public void login(String email, String password) {
        if (getEmail().equals(email) && getPassword().equals(password)) {
            setLoggedIn(true);
            System.out.println("Вы успешно вошли в аккаунт библиотекаря! Здравствуйте, бибблиотекарь " + getName() + "!");
        }
    }
}
