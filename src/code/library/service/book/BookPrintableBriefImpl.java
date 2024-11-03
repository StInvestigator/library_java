package code.library.service.book;

import code.library.model.Book;

public class BookPrintableBriefImpl implements BookPrintable {

    @Override
    public void printBook(Book book) {
        System.out.println("------------------[Book brief information]-------------");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("-------------------[Book information end]--------------");
    }
}
