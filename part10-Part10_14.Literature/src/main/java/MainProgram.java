
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            System.out.println("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            System.out.println("Input the age recommendation: ");
            int recAge = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(name, recAge));
        }
        
        System.out.println(books.size() + " books in total.");
        System.out.println("Books: ");
        Comparator<Book> comparator = Comparator
                .comparing(Book::getRecAge)
                .thenComparing(Book::getName);
        
        Collections.sort(books, comparator);
        
        books.stream()
                .forEach(book -> System.out.println(book));
    }

}
