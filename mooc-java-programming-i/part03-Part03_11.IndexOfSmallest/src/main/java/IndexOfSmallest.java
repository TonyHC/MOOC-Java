
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        ArrayList<Integer> list = new ArrayList<>();
       
        while(true) {
             int num = Integer.valueOf(scanner.nextLine());
             
             if(num == 9999) {
                 break;
             }
             
             list.add(num);
        }
        
        int smallest = list.get(0);
        for(int i = 0; i < list.size(); i++) {
            int currentSmallest = list.get(i);
            if(smallest > currentSmallest) {
                smallest = currentSmallest;
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
        
    }
}
