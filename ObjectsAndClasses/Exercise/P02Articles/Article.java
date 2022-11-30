package ObjectsAndClasses.Exercise.P02Articles;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article (String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    void edit(String content) {
        this.content = content;
    }

    void changeAuthor(String author) {
        this.author = author;
    }

    void rename(String title) {
        this.title = title;
    }

    @Override
   public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }
}
