
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        
        while(true) {
            String info = scanner.nextLine();
            
            if(info.equals("")) {
                break;
            }
            
            String[] infoPieces = info.split(",");
            
            name.add(infoPieces[0]);
            age.add(Integer.valueOf(infoPieces[1]));
        }
        
        int longestName = name.get(0).length();
        int longestNameIndex = 0;
        for(int i = 0; i < name.size(); i++) {
            int currentLongestName = name.get(i).length();
            if(longestName < currentLongestName) {
                longestName = currentLongestName;
                longestNameIndex = i;
            }
        }
        
        int sum = 0;
        int count = 0;
        for(int i = 0; i < age.size(); i++) {
            sum += age.get(i);
            count++;
        }
        
        double average = (double) sum / count;
        
        System.out.println("Longest name: " + name.get(longestNameIndex));
        System.out.println("Average of the birth years: " + average);
    }
}
