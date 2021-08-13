
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.print("First: " + container1.contains() + "/100\n");
            System.out.print("Second: " + container2.contains() + "/100\n");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            System.out.println("");
             String[] data = input.split(" ");
            String command = data[0];
            int value = Integer.valueOf(data[1]);
            
            if(command.equals("add")) {
                container1.add(value);
            } else if(command.equals("move")) {
                if(container1.contains() - value < 0) {
                    container2.add(container1.contains());
                    container1.remove(value);
                } else {
                    container1.remove(value);
                    container2.add(value);
                }
            } else if(command.equals("remove")) {
                container2.remove(value);
            }

        }
    }

}
