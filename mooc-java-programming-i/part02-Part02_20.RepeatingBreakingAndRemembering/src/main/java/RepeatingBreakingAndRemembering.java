
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
      
        int count = 0;
        int sum = 0;
        double avg = 0.0;
        int evenNums = 0;
        int oddNums = 0;
        
        System.out.println("Give numbers:");
        
        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            
            sum += num;
            count++;
            
            if(num == 0) {
                continue;
            }
            
            if(num % 2 == 0) {
                evenNums++;
            } else {
                oddNums++;
            }
        }
        
        avg = (double) sum / count;
        
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + evenNums);
        System.out.println("Odd " + oddNums);
    }
}
