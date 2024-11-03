package code.library.service.book;

import code.library.model.Book;

import java.util.Random;

public class RandomBookStaticArrayImpl implements RandomBook {
    private static final String[] titlesDat =
            new String[]{"Whispers in the Fog",
                    "The Alchemist's Secret",
                    "Beyond the Iron Sea",
                    "Threads of the Forgotten",
                    "The Mapmaker's Daughter",
                    "Echoes of Ember Falls",
                    "The Midnight Archives",
                    "Under a Broken Sky",
                    "A Song for the Hollow Woods",
                    "The Last Lightkeeper"};

    private static final String[] authorsDat =
            new String[]{ "Alice Harper",
                    "Benjamin Gray",
                    "Clara Finch",
                    "Derek Cole",
                    "Elena Frost",
                    "Freya Hughes",
                    "Gavin Stone",
                    "Hannah Reed",
                    "Isaac Turner",
                    "Jenna Blackwood" };

    private static final String[] genresDat =
            new String[]{ "Mystery", "Fantasy", "Historical Fiction",
                    "Adventure", "Drama", "Thriller", "Horror",
                    "Romance", "Science Fiction", "Literary Fiction" };


    @Override
    public Book getRandomBook() {
        Random rand = new Random();
        return new Book(titlesDat[rand.nextInt(titlesDat.length)],
                authorsDat[rand.nextInt(authorsDat.length)],
                genresDat[rand.nextInt(genresDat.length)],
                rand.nextInt(600),
                new BookPrintableFullImpl());
    }
}
