
import java.util.ArrayList;


public class Room {
    ArrayList<Person> personList;
    
    public Room() {
        this.personList = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.personList.add(person);
    }
    
    public boolean isEmpty() {
        return this.personList.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return personList;
    }
    
    public Person shortest() {
        if(this.personList.isEmpty()) {
            return null;
        }
        
        Person shortestPerson = this.personList.get(0);
        for(Person person : this.personList) {
            if(shortestPerson.getHeight() > person.getHeight()) {
                shortestPerson = person;
            }
        }
                
        return shortestPerson;
    }
    
    public Person take() {
        if(this.personList.isEmpty()) {
            return null;
        }
        
        Person shortestPerson = this.personList.get(0);
        for(Person person : this.personList) {
            if(shortestPerson.getHeight() >  person.getHeight()) {
                shortestPerson = person;
            }
        }
        
        this.personList.remove(shortestPerson);
        return shortestPerson;
    }
}
