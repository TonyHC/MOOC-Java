
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int liquidContainer1 = 0;
        int liquidContainer2 = 0;
        while (true) {
            System.out.print("First: " + liquidContainer1 + "/100\n");
            System.out.print("Second: " + liquidContainer2 + "/100\n");
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            System.out.println("");
            String[] data = input.split(" ");
            String command = data[0];
            int value = Integer.valueOf(data[1]);
            
            if(command.equals("add")) {
                if(value < 0) {
                    continue;
                }
                
                if(liquidContainer1 + value <= 100) {
                    liquidContainer1 += value;
                } else if(liquidContainer1 + value > 100) {
                    liquidContainer1 = 100;
                }
            } else if(command.equals("move")) {
                if(value < 0) {
                    continue;
                }
                
                if(liquidContainer1 == 0) {
                    continue;
                } else if(liquidContainer1 - value >= 0 && liquidContainer2 + value <= 100) {
                    liquidContainer2 += value;
                    liquidContainer1 -= value;
                } else if(liquidContainer1 - value < 0) {
                    liquidContainer2 += liquidContainer1;
                    liquidContainer1 = 0;
                } else if(liquidContainer1 - value >= 0 && liquidContainer2 + value > 100) {
                    liquidContainer2 = 100;
                    liquidContainer1 -= value;
                }
            } else if(command.equals("remove")) {
                if(value < 0) {
                    continue;
                }
                
                if(liquidContainer2 == 0) {
                    continue;
                } else if(liquidContainer2 - value >= 0) {
                    liquidContainer2 -= value;
                } else if(liquidContainer2 - value < 0) {
                    liquidContainer2 = 0;
                }
            }
        }
    }

}
