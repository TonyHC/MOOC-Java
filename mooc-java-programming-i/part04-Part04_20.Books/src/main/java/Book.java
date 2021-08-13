
public class Book {
    private String bookTitle;
    private int numberOfPages;
    private int pubYear;
    
    public Book(String mBookTitle, int mNumberOfPages, int mPubYear) {
        this.bookTitle = mBookTitle;
        this.numberOfPages = mNumberOfPages;
        this.pubYear = mPubYear;
    }
    
    public String getBookTitle() {
        return this.bookTitle;
    }
    
    public String toString() {
        return this.bookTitle + ", " + numberOfPages + " pages, " + pubYear;
    }
}
