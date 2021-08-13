
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNums = 0;
        int sumOfNums = 0;
        
        while(true) {
            System.out.println("Give a number:");
            
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num == 0 ) {
                break;
            }
            
            totalNums++;
            sumOfNums += num;
        }
        
        System.out.println("Number of numbers: " + totalNums);
        System.out.println("Sum of the numbers: " + sumOfNums);
    }
}
