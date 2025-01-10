package classes.book;

import java.time.LocalDate;

public class loan {
    private classes.book.book book;
    private classes.users.user user;
    private LocalDate loanDate;
    private LocalDate returnDate;

    public loan(classes.book.book book, classes.users.user user) {
        this.book = book;
        this.user = user;
        this.loanDate = LocalDate.now();
        this.returnDate = null;
    }

    public void completeLoan() {
        this.returnDate = LocalDate.now();
    }

    public classes.book.book getBook() {
        return book;
    }

    public classes.users.user getUser() {
        return user;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }
}
