public class Book extends ReadingItem
{
    private String isbn;
    private String edition;
    private String title;

    public Book(int wordCount, String datePublished, String author) {
        super(wordCount, datePublished, author);
    }
    public Book (String isbn, String edition, String title) {
        super();
        this.isbn = isbn;
        this.edition = edition;
        this.title = title;
    }
}
