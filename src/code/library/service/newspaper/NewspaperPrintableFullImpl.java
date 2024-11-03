package code.library.service.newspaper;

import code.library.model.Newspaper;

public class NewspaperPrintableFullImpl implements NewspaperPrintable {

    @Override
    public void printNewspaper(Newspaper newspaper) {
        System.out.println("---------------[Newspaper full information]-----------");
        System.out.println("Title: " + newspaper.getTitle());
        System.out.println("Publication date: " + newspaper.getPublishDate().toString());
        System.out.println("Headlines: \"" + String.join("\", \"", newspaper.getHeadlines()) + '\"');
        System.out.println("---------------[Newspaper information end]------------");
    }
}
