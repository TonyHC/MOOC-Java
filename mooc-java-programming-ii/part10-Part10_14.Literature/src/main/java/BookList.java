
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class BookList {
    private List<Book> bookList;
    
    public BookList() {
        this.bookList = new ArrayList<>();
    }

    public void addBookRec (Book book) {
        this.bookList.add(book);
    }
    
    public int totalBooks() {
        return this.bookList.size();
    }
    
    public void printAllBookRecs() {
        Comparator<Book> comparator = Comparator
                                .comparing(Book::getAgeRec)
                                .thenComparing(Book::getName);
                
        Collections.sort(this.bookList, comparator);
        
        this.bookList.stream().forEach(book -> System.out.println(book));
    }
}
