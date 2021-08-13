
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();
        
        System.out.println("Input numbers, type end to stop.");
        while(true) {
            String number = scanner.nextLine();
            if(number.endsWith("end")) {
                break;
            }
        
            numbers.add(number);
        }
        
        System.out.println("\nPrint the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        
        double average = 0.0;
        if(input.equals("p")) {
            average = numbers.stream()
                            .mapToInt(n -> Integer.valueOf(n))
                            .filter(num -> num >= 0)
                            .average()
                            .getAsDouble(); 
        } 
        
        if(input.equals("n")) {
            average = numbers.stream()
                            .mapToInt(n -> Integer.valueOf(n))
                            .filter(num -> num < 0)
                            .average()
                            .getAsDouble();
        }
        
        System.out.println("Average of the positive numbers: " + average);
    }
}
