
import java.util.HashSet;
import java.util.Set;



public class Main {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("FZ");
        names.add("AD");
        names.add("B");
        names.add("CT");
        names.add("BA");
        names.add("AA");
        
        for(String name : names) {
            System.out.println(name);
        }
        
        System.out.println("\n" + returnSize(names));
    }

    public static int returnSize(Set<String> nameSet) {
        return nameSet.size();
    }
}
