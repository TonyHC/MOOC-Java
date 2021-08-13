
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();


        while (true) {
            System.out.print("First: " + container1 + "\nSecond: " + container2 + "\n");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] info = input.split(" ");
            String command = info[0];
            int value = Integer.valueOf(info[1]);
            
            if(command.equals("add")) {
                container1.add(value);
            } else if(command.equals("move")) {
                if(value <= container1.contains()) {
                    container2.add(value); 
                    container1.remove(value);
                } else {
                    container2.add(container1.contains());
                    container1.remove(value);  
                }
            } else if(command.equals("remove")) {
                container2.remove(value);
            }

        }
    }

}
