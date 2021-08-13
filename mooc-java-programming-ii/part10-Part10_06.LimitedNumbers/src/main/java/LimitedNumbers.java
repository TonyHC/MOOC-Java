
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> range = new ArrayList<>();
        
        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            if(num < 0) {
                break;
            }
            
            range.add(num);
        }
        
        range.stream().filter(num -> num >= 1 && num <= 5)
                    .forEach(num -> System.out.println(num));
    }
}
