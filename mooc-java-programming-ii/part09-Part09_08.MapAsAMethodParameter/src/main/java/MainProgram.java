
import java.util.HashMap;
import java.util.Map;



public class MainProgram {

    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        names.put("F", "First");
        names.put("S", "Second");
        
        System.out.println(returnSize(names));
    }

    public static int returnSize(Map<String, String> names) {
        return names.size();
    }
}
