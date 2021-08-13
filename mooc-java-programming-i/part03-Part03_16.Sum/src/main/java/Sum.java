
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(4);
        num.add(2);
        num.add(231);
        num.add(-3);
        num.add(0);
        
        System.out.println(sum(num));
    }

    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        
        return sum;
    }
}
