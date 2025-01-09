package Classes;

import java.util.ArrayList;
import java.util.List;

public class Reader extends User {
    private final List<String> borrowingHistory;
    private final List<Loan> currentLoans;

    public Reader(String name, String email, String password) {
        super(name, email, password);
        this.borrowingHistory = new ArrayList<>();
        this.currentLoans = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (isLoggedIn()) {
            if (book.isAvailable()) {
                Loan loan = new Loan(book, this);
                currentLoans.add(loan);
                book.updateStatus(false);
                borrowingHistory.add("Взята книга: " + book.getTitle());
                System.out.println("Читатель " + getName() + " взял(а) книгу " + book.getTitle() + " " + loan.getLoanDate());
            } else {
                System.out.println("Книга " + book.getTitle() + " не доступна.");
            }
        } else {
            System.out.println("Нужно войти в аккаунт");
        }
    }

    public void returnBook(Book book) {
        if (isLoggedIn()) {
            Loan loanToRemove = null;
            for (Loan loan : currentLoans) {
                if (loan.getBook().equals(book)) {
                    loanToRemove = loan;
                    break;
                }
            }
            if (loanToRemove != null) {
                loanToRemove.completeLoan();
                book.updateStatus(true);
                borrowingHistory.add("Возвращена книга: " + book.getTitle());
                currentLoans.remove(loanToRemove);
                System.out.println("Читатель " + getName() + " вернул(а) книгу " + book.getTitle() + " " + loanToRemove.getReturnDate());
            } else {
                System.out.println("Вы не брали книгу " + book.getTitle() + ".");
            }
        } else {
            System.out.println("Нужно войти в аккаунт");
        }
    }

    public void viewCurrentLoans() {
        if (isLoggedIn()) {
            System.out.println(getName() + ", ваши текущие займы:");
            for (Loan loan : currentLoans) {
                System.out.println(loan);
            }
        } else {
            System.out.println("Нужно войти в аккаунт");
        }
    }

    public void viewHistory() {
        if (isLoggedIn()) {
            System.out.println(getName() + ", ваша читательская история:");
            for (String record : borrowingHistory) {
                System.out.println(record);
            }
        } else {
            System.out.println("Нужно войти в аккаунт");
        }
    }
}