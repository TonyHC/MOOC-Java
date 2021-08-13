
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int liquidContainerMaxSize = 100;
        int liquidContainer1 = 0;
        int liquidContainer2 = 0;

        while (true) {
            System.out.println("First: " + liquidContainer1 + "/100");
            System.out.println("Second: " + liquidContainer2 + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] data = input.split(" ");
            String command = data[0];
            int value = Integer.valueOf(data[1]);
            
            if(command.equals("add")) {
                if(liquidContainer1 + value > 100) {
                    liquidContainer1 = 100;
                } else if (value < 0){
                    continue;
                } else {
                    liquidContainer1 += value;
                }
            } else if(command.equals("move")) {
                if(value < 0) {
                    continue;
                }
                
                if(liquidContainer1 == 0) {
                    liquidContainer1 = 0;
                    liquidContainer2 = 0;
                } else if(liquidContainer1 - value  <= 0 && liquidContainer2 + value > 100) {
                    liquidContainer1 = 0;
                    liquidContainer2 = 100;
                } else if(liquidContainer1 - value <= 0 && liquidContainer2 + value < 100) {
                    liquidContainer2 += liquidContainer1;
                    liquidContainer1 = 0;
                } else if(liquidContainer1 - value > 0 && liquidContainer2 + value > 100) {
                    liquidContainer1 -= value;
                    liquidContainer2 = 100;
                } else if(liquidContainer1 - value > 0 && liquidContainer2 + value < 100) {
                    liquidContainer1 -= value;
                    liquidContainer2 += value;
                } 
            } else if(command.equals("remove")) {
                if(value < 0) {
                    continue;
                }
                
                if(liquidContainer2 - value < 0) {
                    liquidContainer2 = 0;
                } else {
                    liquidContainer2 -= value;
                }
            }
        }
    }

}
