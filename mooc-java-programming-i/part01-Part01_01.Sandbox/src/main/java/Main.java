
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        String str = "manchester united (with nice players)";
        System.out.println(str.replace("(with nice players)", ""));
        int index = str.indexOf("(");
        System.out.println(str.substring(0, index));
        printRandomNumbers(10);
        
        
               int n = 3;
        if (n % 2 == 0) throw new RuntimeException("n must be odd");

        int[][] magic = new int[n][n];

        int row = n-1;
        int col = n/2;
        magic[row][col] = 1;

        for (int i = 2; i <= n*n; i++) {
            if (magic[(row + 1) % n][(col + 1) % n] == 0) {
                System.out.println("if: " + i);
                row = (row + 1) % n;
                col = (col + 1) % n;
            }
            else {
                row = (row - 1 + n) % n;
                // don't change col
            }
            magic[row][col] = i;
        }

        // print results
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (magic[i][j] < 10)  System.out.print(" ");  // for alignment
                if (magic[i][j] < 100) System.out.print(" ");  // for alignment
                System.out.print(magic[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void printRandomNumbers(int times) {
         Random rand = new Random();
        int randVal =  0;
        for(int i = 0; i < times; i++) {
            randVal = rand.nextInt(1) + 2;
            System.out.println(randVal);
        }
    }
}
