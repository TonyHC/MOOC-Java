import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true) {
            System.out.print("Title: ");
            String bookTitle = scanner.nextLine();
            if(bookTitle.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            int numOfBookPages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
        
            books.add(new Book(bookTitle, numOfBookPages, publicationYear));
        }
        
        System.out.print("\nWhat information will be printed? ");
        String input = scanner.nextLine();
        if(input.equals("everything")) {
            for(Book book : books) {
                System.out.println(book.toString());
            }
        }
        
        if(input.equals("name")) {
            for(Book book : books) {
                System.out.println(book.getBookTitle());
            }
        }
    }
}
