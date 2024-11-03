package code.library.service.almanac;

import code.library.model.Almanac;
import code.library.model.Book;
import code.library.service.book.RandomBook;

import java.util.Random;

public class RandomAlmanacStaticArrayImpl implements RandomAlmanac {
    private final Book[] books;
    private RandomBook bookFactory;
    private static final String[] titlesDat =
            new String[]{"The Annual Almanac of Wonders",
                    "Chronicles of the Changing Seasons",
                    "Yearly Reflections: Almanac of Life",
                    "The World in Numbers: An Almanac",
                    "Almanac of Natural Phenomena",
                    "The Celestial Almanac: Stars and Seasons",
                    "Harvest Almanac: A Guide to Bounty",
                    "The Almanac of Historical Events",
                    "Eco Almanac: Nature's Calendar",
                    "The Almanac of Dreams"};


    public RandomAlmanacStaticArrayImpl(RandomBook bookFactory) {
        Random rand = new Random();
        this.bookFactory = bookFactory;
        books = new Book[rand.nextInt(1,5)];
    }

    @Override
    public Almanac getRandomAlmanac() {
        for (int i = 0; i < books.length; i++) {
            books[i] = bookFactory.getRandomBook();
        }
        Random rand = new Random();

        return new Almanac(books,
                titlesDat[rand.nextInt(titlesDat.length)],
                new AlmanacPrintableImpl());
    }

    public void setBookFactory(RandomBook bookFactory) {
        this.bookFactory = bookFactory;
    }
}
