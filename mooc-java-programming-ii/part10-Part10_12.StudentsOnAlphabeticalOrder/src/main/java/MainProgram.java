
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class MainProgram {

    public static void main(String[] args) {
        Student first = new Student("jamo");
        Student second = new Student("jamo1");
        Student third = new Student("Fred");
        System.out.println(first.compareTo(second));
        
        List<Student> students = new ArrayList<>();
        students.add(first);
        students.add(second);
        students.add(third);
        
        Collections.sort(students);
        System.out.println(students);
    }
}
