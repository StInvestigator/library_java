package code.library.model;

import code.library.service.book.BookPrintable;

public class Book extends Publication {
    private final String author;
    private final String genre;
    private final int pagesCount;
    private BookPrintable bookPrintable;

    public Book(String title, String author, String genre, int pagesCount, BookPrintable bookPrintable) {
        super(title);
        this.author = author;
        this.genre = genre;
        this.pagesCount = pagesCount;
        this.bookPrintable = bookPrintable;
    }

    @Override
    public void print() {
        bookPrintable.printBook(this);
    }

    @Override
    public boolean isAuthor(String author) {
        return this.author.equals(author);
    }

    public void setBookPrintable(BookPrintable bookPrintable) {
        this.bookPrintable = bookPrintable;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getPagesCount() {
        return pagesCount;
    }
}
