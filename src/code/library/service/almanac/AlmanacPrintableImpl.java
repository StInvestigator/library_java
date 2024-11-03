package code.library.service.almanac;

import code.library.model.Almanac;
import code.library.model.Book;

public class AlmanacPrintableImpl implements AlmanacPrintable {
    public void printAlmanac(Almanac almanac) {
        System.out.println("-------------------[Almanac information]----------------");
        System.out.println("Title: " + almanac.getTitle());
        System.out.println("----------------------[Almanac books]-------------------");
        for(Book book : almanac.getBooks()) {
            book.print();
        }
        System.out.println("----------------[Almanac information end]---------------");
    }
}
