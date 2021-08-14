
public class AdvancedAstrology {
    public static void main(String[] args) {
        christmasTree(10);
    }

    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int number) {
        for (int i = 1; i <= number + (number - 1); i++) {
            System.out.print("*");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
            System.out.println();
        }
    }

    public static void christmasTree(int height) {
        printTriangle(height);
        printSpaces(height - 2);
        printStars(2);
        System.out.println();
        printSpaces(height - 2);
        printStars(2);
    }
}
