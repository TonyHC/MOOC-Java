
import java.util.Scanner;


public class UserInterface {
    private Scanner scanner;
    private BookList bookList;
    
    public UserInterface(Scanner scanner, BookList bookList) {
        this.scanner = scanner;
        this.bookList = bookList;
    }
    
    public void start() {
        while(true) {
            System.out.print("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            if(bookName.isEmpty()) {
                break;
            }
            
            System.out.print("Input the age recommendation: ");
            int ageRec = Integer.valueOf(scanner.nextLine());
            
            System.out.println("");
            
            this.bookList.addBookRec(new Book(bookName, ageRec));
        }
        
        System.out.println("\n" + this.bookList.totalBooks() + " books in total.");
        
        System.out.println("\nBooks:");
        this.bookList.printAllBookRecs();
    }
}
