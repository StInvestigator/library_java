package code.library.model;

public abstract class Publication implements PublicationInterface {
    protected String title;

    public Publication(String title) {
        this.title = title;
    }

    @Override
    public boolean isTitle(String title) {
        return this.title.equalsIgnoreCase(title);
    }

    public String getTitle() {
        return title;
    }
}
