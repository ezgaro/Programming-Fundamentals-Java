public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title ,String content , String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void edit(String newContent) {
        this.content = newContent;
    }

    public void changeAuthor(String author) {
        this.author = author;
    }

    public void rename(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }

}
