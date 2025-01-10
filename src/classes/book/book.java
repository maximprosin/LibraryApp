package classes.book;

public class book {
    private String title;
    private String author;
    private String genre;
    private String ISBN;
    private boolean isAvailable;

    public book(String title, String author, String genre, String ISBN, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.ISBN = ISBN;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.trim().isEmpty()) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Поле названия не должно быть пустым");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        } else {
            throw new IllegalArgumentException("Поле автор не должно быть пустым");
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (genre != null && !genre.trim().isEmpty()) {
            this.genre = genre;
        } else {
            throw new IllegalArgumentException("Поле жанра не должно быть пустым");
        }
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        if (ISBN != null && !ISBN.trim().isEmpty()) {
            this.ISBN = ISBN;
        } else {
            throw new IllegalArgumentException("Поле ISBN не должно быть пустым");
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public String getDetails() {
        return "Название книги: " + title + "\n" +
                "Автор: " + author + "\n" +
                "Жанр: " + genre + "\n" +
                "ISBN: " + ISBN + "\n" +
                "Статус: " + (isAvailable ? "В наличии" : "Взята");
    }

    public void updateStatus(boolean status) {
        this.isAvailable = status;
    }
}