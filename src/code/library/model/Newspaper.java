package code.library.model;

import code.library.service.newspaper.NewspaperPrintable;

import java.time.LocalDate;

public class Newspaper extends Publication {
    private final LocalDate publishDate;
    private final String[] headlines;
    private NewspaperPrintable newspaperPrintable;

    public Newspaper(String title, LocalDate publishDate, String[] headlines, NewspaperPrintable newspaperPrintable) {
        super(title);
        this.publishDate = publishDate;
        this.headlines = headlines;
        this.newspaperPrintable = newspaperPrintable;
    }

    @Override
    public void print() {
        newspaperPrintable.printNewspaper(this);
    }

    @Override
    public boolean isAuthor(String author) {
        return false;
    }

    public void setNewspaperPrintable(NewspaperPrintable newspaperPrintable) {
        this.newspaperPrintable = newspaperPrintable;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public String[] getHeadlines() {
        return headlines;
    }
}
