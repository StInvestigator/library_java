package code.library.model;

import java.util.Scanner;

public class UserInterface {
    private LibraryCatalog catalog;

    public UserInterface(LibraryCatalog catalog) {
        this.catalog = catalog;
    }

    public UserInterface(int count) {
        this(new LibraryCatalog(count));
    }

    public void start() {
        int choice;
        do {
            System.out.println("------------------------------++[Menu]++-----------------------------");
            System.out.println("1 - Print all publications");
            System.out.println("2 - Find publication by title");
            System.out.println("3 - Find publication by author");
            System.out.println("4 - Exit");
            System.out.println("---------------------------------------------------------------------");
            System.out.print("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    catalog.print();
                    break;
                case 2:
                    findByTitle();
                    break;
                case 3:
                    findByAuthor();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        } while (choice != 4);
    }

    private void findByTitle() {
        Scanner scanner = new Scanner(System.in);
        String title;

        System.out.print("Enter the publication title: ");
        title = scanner.nextLine();

        Publication publicationFound = catalog.findByTitle(title);

        System.out.println("--------------------[Searching result]---------------------");
        if (publicationFound != null) {
            publicationFound.print();
        } else {
            System.out.println("No publication found.");
        }
        System.out.println("----------------------[Searching end]-----------------------");
    }

    private void findByAuthor() {
        Scanner scanner = new Scanner(System.in);
        String author;

        System.out.print("Enter the author`s name: ");
        author = scanner.nextLine();

        Publication[] publicationsFound = catalog.findByAuthor(author);

        System.out.println("--------------------[Searching results]---------------------");
        if (publicationsFound != null) {
            for (Publication publication : publicationsFound) {
                publication.print();
            }
        } else {
            System.out.println("No publications found.");
        }
        System.out.println("----------------------[Searching end]-----------------------");
    }

    public void setCatalog(LibraryCatalog catalog) {
        this.catalog = catalog;
    }
}
