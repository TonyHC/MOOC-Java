
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        double avg;
        
        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }
            
            if(num < 0) {
                continue;
            }
            
            if(num > 0) {
                count++;
                sum += num;
            }
        }
        
        avg = (double) sum / count;
        System.out.println(avg);
    }
}
