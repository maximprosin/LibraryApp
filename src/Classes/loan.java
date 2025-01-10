package Classes;

import java.time.LocalDate;

public class loan {
    private Classes.book book;
    private Classes.user user;
    private LocalDate loanDate;
    private LocalDate returnDate;

    public loan(Classes.book book, Classes.user user) {
        this.book = book;
        this.user = user;
        this.loanDate = LocalDate.now();
        this.returnDate = null;
    }

    public void completeLoan() {
        this.returnDate = LocalDate.now();
    }

    public Classes.book getBook() {
        return book;
    }

    public Classes.user getUser() {
        return user;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }
}
