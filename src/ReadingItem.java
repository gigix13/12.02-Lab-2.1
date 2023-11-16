public class ReadingItem extends CISItem {
    private int wordCount;
    private String datePublished;
    private String author;

    public ReadingItem(int wordCount, String datePublished, String author){
        this.wordCount = wordCount;
        this.datePublished = datePublished;
        this.author = author;
    }

    public ReadingItem() {

    }
}
