package code.library.service.newspaper;

import code.library.model.Newspaper;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class RandomNewspaperStaticArrayImpl implements RandomNewspaper {

    private static final String[] titlesDat =
            new String[]{"The Daily Chronicle",
                    "Morning News Gazette",
                    "The City Observer",
                    "Evening Bulletin",
                    "The National Report",
                    "The Weekly Review",
                    "The Global Times",
                    "Metro News Daily",
                    "The Community Herald",
                    "Front Page Today"};

    private static final LocalDate[] datesDat =
            new LocalDate[]{
                    LocalDate.of(2024, 1, 15),
                    LocalDate.of(2024, 2, 22),
                    LocalDate.of(2024, 3, 10),
                    LocalDate.of(2024, 4, 5),
                    LocalDate.of(2024, 5, 17),
                    LocalDate.of(2024, 6, 30),
                    LocalDate.of(2024, 7, 12),
                    LocalDate.of(2024, 8, 21),
                    LocalDate.of(2024, 9, 15),
                    LocalDate.of(2024, 10, 30)
            };

    private static final String[] headlinesDate =
            new String[]{
                    "Local Community Comes Together for Annual Charity Event",
                    "New Park Opens in Downtown: A Green Oasis",
                    "City Council Approves New Housing Development",
                    "School District Unveils Innovative Learning Program",
                    "Tech Company Announces Major Breakthrough in AI",
                    "Weather Forecast Predicts Record Low Temperatures",
                    "Local Artist Wins National Award for Sculpture",
                    "New Public Transportation Initiative Launches Next Month",
                    "Health Department Issues Flu Season Advisory",
                    "Annual Food Festival Draws Record Crowds"
            };

    @Override
    public Newspaper getRandomNewspaper() {
        Random rand = new Random();
        String[] headlines = new String[rand.nextInt(1, headlinesDate.length / 3)];
        int randomInt;
        for (int i = 0; i < headlines.length; ) {
            randomInt = rand.nextInt(headlinesDate.length);
            if (!Arrays.asList(headlines).contains(headlinesDate[randomInt])) {
                headlines[i] = headlinesDate[randomInt];
                i++;
            }
        }
        return new Newspaper(titlesDat[rand.nextInt(titlesDat.length)],
                datesDat[rand.nextInt(datesDat.length)],
                headlines,
                new NewspaperPrintableFullImpl());
    }
}
