package code.library.service.book;

import code.library.model.Book;

public class BookPrintableFullImpl implements BookPrintable {

    @Override
    public void printBook(Book book) {
        System.out.println("------------------[Book full information]-------------");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Genre: " + book.getGenre());
        System.out.println("Pages: " + book.getPagesCount());
        System.out.println("------------------[Book information end]--------------");
    }
}
