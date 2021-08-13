
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(esko);
        persons.add(ollie);
        persons.add(new Student("Mark Wyane", "291 West Avenue"));
        
        printPersons(persons);
    }
    
    public static void printPersons(ArrayList<Person> persons) {
        for(Person person : persons) {
            System.out.println(person);
        }
    }
}
