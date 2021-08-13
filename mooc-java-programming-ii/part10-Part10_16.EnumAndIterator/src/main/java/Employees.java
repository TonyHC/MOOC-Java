
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Employees {
    private List<Person> employeeList;
    
    public Employees() {
        this.employeeList = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.employeeList.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();
        
        while(iterator.hasNext()) {
            this.employeeList.add(iterator.next());
        }
        
        // peopleToAdd.stream().forEach(person -> this.employeeList.add(person));
    }
    
    public void print() {
        Iterator<Person> iterator = this.employeeList.iterator();
        
        while(iterator.hasNext()) {
            Person currentPerson = iterator.next();
            System.out.println(currentPerson);
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = this.employeeList.iterator();
        
        while(iterator.hasNext()) {
            Person currentPerson = iterator.next();
            if(currentPerson.getEducation() == education) {
                System.out.println(currentPerson);
            }
        }
    }
        
    public void fire(Education education) {
        Iterator<Person> iterator = this.employeeList.iterator();
        
        while(iterator.hasNext()) {
            if(iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
