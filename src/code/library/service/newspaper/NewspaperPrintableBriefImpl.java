package code.library.service.newspaper;

import code.library.model.Newspaper;

public class NewspaperPrintableBriefImpl implements NewspaperPrintable {

    @Override
    public void printNewspaper(Newspaper newspaper) {
        System.out.println("---------------[Newspaper brief information]-----------");
        System.out.println("Title: " + newspaper.getTitle());
        System.out.println("Publication date: " + newspaper.getPublishDate().toString());
        System.out.println("----------------[Newspaper information end]------------");
    }
}
