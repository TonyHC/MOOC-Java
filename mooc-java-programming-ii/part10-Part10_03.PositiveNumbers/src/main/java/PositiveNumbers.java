
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pos = new ArrayList<>();
        pos.add(44);
        pos.add(12);
        pos.add(-2);
        pos.add(142);
        System.out.println(positive(pos));
    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream().filter(num -> num > 0).collect(Collectors.toList());
    }
}
