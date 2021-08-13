
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());
        
        double giftTax1 = (100 + (giftValue - 5000) * 0.08);
        double giftTax2 = (1700 + (giftValue - 25000) * 0.10);
        double giftTax3 = (4700 + (giftValue - 55000) * 0.12);
        double giftTax4 = (22100 + (giftValue - 200000) * 0.15);
        double giftTax5 = (142100 + (giftValue - 1000000) * 0.17);
        
        if(giftValue >= 1000000) {
            System.out.println("Tax: " + giftTax5);
        } else if (giftValue >= 200000) {
            System.out.println("Tax: " + giftTax4);
        } else if (giftValue >= 55000) {
            System.out.println("Tax; " + giftTax3);
        } else if (giftValue >= 25000) {
            System.out.println("Tax: " + giftTax2);
        } else if (giftValue >= 5000) {
            System.out.println("Tax: "+ giftTax1);
        } else {
            System.out.println("No tax!");
        }
        
    
    }
}
