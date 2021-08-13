
import java.util.ArrayList;
import java.util.List;


public class mainProgram {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        
        System.out.println(returnSize(names));
    }

    public static int returnSize(List<String> nameList) {
        return nameList.size();
    }
}
