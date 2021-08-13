
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        
        while(true) {
            String info = scanner.nextLine();
            
            if(info.equals("")) {
                break;
            }
            
            String[] infoParts = info.split(",");
            
            list.add(Integer.valueOf(infoParts[1]));
        }
        
        int oldest = list.get(0);
        for(int i = 0; i < list.size(); i++) {
            int currentOldest = list.get(i);
            if(oldest < currentOldest) {
                oldest = currentOldest;
            }
        }
        
        System.out.println("Age of the oldest: " + oldest);
    }
}
