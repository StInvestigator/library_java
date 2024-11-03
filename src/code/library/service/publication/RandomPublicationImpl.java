package code.library.service.publication;

import code.library.model.Publication;
import code.library.service.almanac.RandomAlmanac;
import code.library.service.book.RandomBook;
import code.library.service.newspaper.RandomNewspaper;

import java.util.Random;

public class RandomPublicationImpl implements RandomPublication {
    private RandomBook randomBook;
    private RandomNewspaper randomNewspaper;
    private RandomAlmanac randomAlmanac;

    public RandomPublicationImpl(RandomBook randomBook,
                                 RandomNewspaper randomNewspaper,
                                 RandomAlmanac randomAlmanac) {
        this.randomBook = randomBook;
        this.randomNewspaper = randomNewspaper;
        this.randomAlmanac = randomAlmanac;
    }

    @Override
    public Publication getRandomPublication() {
        Random random = new Random();
        return switch (random.nextInt(3)) {
            case 0 -> randomBook.getRandomBook();
            case 1 -> randomNewspaper.getRandomNewspaper();
            case 2 -> randomAlmanac.getRandomAlmanac();
            default -> null;
        };
    }

    public void setRandomBook(RandomBook randomBook) {
        this.randomBook = randomBook;
    }

    public void setRandomNewspaper(RandomNewspaper randomNewspaper) {
        this.randomNewspaper = randomNewspaper;
    }

    public void setRandomAlmanac(RandomAlmanac randomAlmanac) {
        this.randomAlmanac = randomAlmanac;
    }
}
