package code.library.utils;

import code.library.model.Publication;
import code.library.service.publication.RandomPublication;

public class PublicationFactory {
    private RandomPublication randomPublication;

    public PublicationFactory(RandomPublication randomPublication) {
        this.randomPublication = randomPublication;
    }

    public Publication createRandomPublication() {
        return randomPublication.getRandomPublication();
    }

    public void setRandomPublication(RandomPublication randomPublication) {
        this.randomPublication = randomPublication;
    }
}
