package Classes;

public class Librarian extends User {
    private Library library;

    public Librarian(String name, String email, String password, Library library) {
        super(name, email, password);
        this.library = library;
    }

    public void addBook(Book book) {
        library.addBook(book);
        System.out.println("Книга " + book.getTitle() + " была добавлена на полку");
    }

    public void removeBook(Book book) {
        library.removeBook(book);
        System.out.println("Книга " + book.getTitle() + " была убрана с полки");
    }

    public void editBook(Book book) {
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
