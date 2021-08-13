
import java.util.ArrayList;


public class MainProgram {

    public static void main(String[] args) {
        Employees university = new Employees();
        
        Person tom = new Person("TOM", Education.BA);
        Person tob = new Person("TOB", Education.BA);
        Person toby = new Person("TOBY", Education.BA);
        
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(tob);
        persons.add(toby);
        persons.add(tom);
        
        university.add(persons);
        university.print(Education.BA);
    }
}
