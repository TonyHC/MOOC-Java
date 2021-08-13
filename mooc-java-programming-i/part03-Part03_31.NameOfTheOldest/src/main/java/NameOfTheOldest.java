
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        
        while(true) {
            String info = scanner.nextLine();
            
            if(info.equals("")) {
                break;
            }
            
            String[] infoParts = info.split(",");
            
            name.add(infoParts[0]);
            age.add(Integer.valueOf(infoParts[1]));
        }
        
        int oldest = age.get(0);
        int oldestIndex = 0;
        for(int i = 0; i < age.size(); i++) {
            int currentOldest = age.get(i);
            if(oldest < currentOldest) {
                oldest = currentOldest;
                oldestIndex = i;
            }
        }
        
        System.out.println("Name of the oldest: " + name.get(oldestIndex));
    }
}
