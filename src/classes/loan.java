package classes;

import java.time.LocalDate;

public class loan {
    private book book;
    private user user;
    private LocalDate loanDate;
    private LocalDate returnDate;

    public loan(book book, user user) {
        this.book = book;
        this.user = user;
        this.loanDate = LocalDate.now();
        this.returnDate = null;
    }

    public void completeLoan() {
        this.returnDate = LocalDate.now();
    }

    public book getBook() {
        return book;
    }

    public user getUser() {
        return user;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }
}
