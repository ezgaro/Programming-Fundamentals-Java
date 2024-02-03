public class Book implements Comparable<Book>{
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

    @Override
    public int compareTo(Book other) {
        int result = this.title.compareTo(other.title);
        if(result == 0) {
            result = Integer.compare(this.year, other.year);
        }

        return result;

    }
}