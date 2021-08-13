
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        double average;
        
        while(true) {
            System.out.println("Give a number:");
            
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num != 0) {
                count++;
                sum += num;
            } else {
                break;
            }
        }
        
        average = (double) sum / count;
        
        System.out.println("Average of the numbers: " + average);
    }
}
