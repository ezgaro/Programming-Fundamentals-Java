public class Book {
    private String title;
    private int year;
    private String[] authors;

    public Book(String title, int year, String... authors) {
        this.title = title;
        this.year = year;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }
}