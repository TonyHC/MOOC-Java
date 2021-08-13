
public class Book {
    private String name;
    private int ageRec;
    
    public Book(String name, int ageRec) {
        this.name = name;
        this.ageRec = ageRec;
    }

    public String getName() {
        return name;
    }

    public int getAgeRec() {
        return ageRec;
    }

    @Override
    public String toString() {
        return name + " (recommended for " + ageRec + " year-olds or older)"; 
    }
}

