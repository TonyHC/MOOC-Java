
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());
        
        double sqrtNum1 = Math.sqrt(num1);
        double sqrtNum2 = Math.sqrt(num2);
        
        int sum = (int) sqrtNum1 + (int) sqrtNum2;
        System.out.println(sum);
    }
}
