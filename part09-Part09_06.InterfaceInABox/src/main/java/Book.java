
public class Book implements Packable {
    private String authorName;
    private String bookName;
    private double bookWeight;
    
    public Book(String author, String bookName, double weight){
        this.authorName = author;
        this.bookName = bookName;
        this.bookWeight = weight;
    }

    @Override
    public double weight() {
        return this.bookWeight;
    }

    @Override
    public String toString() {
        return authorName + ": " + bookName;
    }
    
    
    
}
