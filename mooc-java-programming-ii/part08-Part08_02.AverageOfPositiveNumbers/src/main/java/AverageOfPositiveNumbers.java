
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveNums = 0;
        int sum = 0;
        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0) {
                break;
            }
            
            if(num > 0) {
                sum += num;
                positiveNums++;
            }
        }
        
        if(positiveNums == 0) {
            System.out.println("Cannot calculate the average");
        }
        
        double avg = (double) sum / positiveNums;
        System.out.println(avg);
    }
}
