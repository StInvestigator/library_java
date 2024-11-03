package code.library.model;

import code.library.service.almanac.AlmanacPrintable;

public class Almanac extends Publication {
    private final Book[] books;
    private AlmanacPrintable almanacPrintable;

    public Almanac(Book[] books, String title, AlmanacPrintable almanacPrintable) {
        super(title);
        this.books = books;
        this.almanacPrintable = almanacPrintable;
    }

    @Override
    public void print() {
        almanacPrintable.printAlmanac(this);
    }

    @Override
    public boolean isAuthor(String author) {
        for (Book book : books) {
            if (book.isAuthor(author)) {
                return true;
            }
        }
        return false;
    }

    public void setAlmanacPrintable(AlmanacPrintable almanacPrintable) {
        this.almanacPrintable = almanacPrintable;
    }

    public Book[] getBooks() {
        return books;
    }
}
