
public class Book {
    private String title;
    private int numberOfPages;
    private int year;
    
    public Book(String title, int numberOfPages, int year){
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.year = year;
    }
    public String getTitle(){
        return this.title;
    }

    public String toString(){
        return this.title + ", " + this.numberOfPages + " pages, " + this.year;
    }
    
    
}
