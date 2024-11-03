package code.library.model;

import code.library.service.almanac.RandomAlmanacStaticArrayImpl;
import code.library.service.book.RandomBookStaticArrayImpl;
import code.library.service.newspaper.RandomNewspaperStaticArrayImpl;
import code.library.service.publication.RandomPublicationImpl;
import code.library.utils.PublicationFactory;

public class LibraryCatalog {
    private Publication[] publications;

    public LibraryCatalog(int count) {
        publications = new Publication[count];
        for (int i = 0; i < count; i++) {
            PublicationFactory factory = new PublicationFactory(new RandomPublicationImpl(
                    new RandomBookStaticArrayImpl(),
                    new RandomNewspaperStaticArrayImpl(),
                    new RandomAlmanacStaticArrayImpl(new RandomBookStaticArrayImpl())
            ));

            publications[i] = factory.createRandomPublication();
        }
    }

    public void print() {
        for (Publication publication : publications) {
            publication.print();
        }
    }

    public Publication findByTitle(String title) {
        for (Publication publication : publications) {
            if (publication.isTitle(title)) {
                return publication;
            }
        }
        return null;
    }

    public Publication[] findByAuthor(String author) {
        int counter = 0;
        for (Publication publication : publications) {
            if (publication.isAuthor(author)) {
                counter++;
            }
        }
        if (counter == 0) {
            return null;
        }
        Publication[] result = new Publication[counter];
        counter = 0;
        for (Publication publication : publications) {
            if (publication.isAuthor(author)) {
                result[counter] = publication;
                counter++;
            }
        }
        return result;
    }

    public void setPublications(Publication[] publications) {
        this.publications = publications;
    }
}
