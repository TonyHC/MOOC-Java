
public class Archive {
    private String identifier;
    private String name;
    
    public Archive(String mIdentifier, String mName) {
        this.identifier = mIdentifier;
        this.name = mName;
    }
    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public boolean equals(Object compared) {
        if(this == compared) 
            return true;
        
        if(!(compared instanceof Archive)) 
            return false;
        
        Archive comparedArchive = (Archive) compared;
        
        return (this.identifier.equals(comparedArchive.identifier));
    }
    
    public String toString() {
        return identifier + ": " + name;
    }
}
