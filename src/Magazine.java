public class Magazine extends ReadingItem {
    private String coverStoryTitle;
    private String printDate;

    public Magazine(int wordCount, String datePublished, String author) {
        super(wordCount, datePublished, author);
    }

    public Magazine(String coverStoryTitle, String printDate){
        this.coverStoryTitle = coverStoryTitle;
        this.printDate = printDate;
    }
}
