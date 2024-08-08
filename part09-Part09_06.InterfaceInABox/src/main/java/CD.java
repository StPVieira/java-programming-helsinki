
public class CD implements Packable {
    private String artistName;
    private String cdName;
    private int publicationYear;
    
    public CD(String artistName, String cdName, int publicationYear){
        this.artistName = artistName;
        this.cdName = cdName;
        this.publicationYear = publicationYear;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    @Override
    public String toString() {
        return artistName + ": " + cdName + " (" + publicationYear + ")";
    }
    
    
    
}
