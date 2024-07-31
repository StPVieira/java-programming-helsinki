
public class Archive {
    private String identifier;
    private String name;
    
    public Archive(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }
    
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Archive)){
            return false;
        }
        
        Archive comparedArchive = (Archive) compared;
        
        return this.identifier.equals(comparedArchive.identifier);
    }
    
    @Override
    public String toString() {
        return identifier + ": " + name; //To change body of generated methods, choose Tools | Templates.
    }

}
