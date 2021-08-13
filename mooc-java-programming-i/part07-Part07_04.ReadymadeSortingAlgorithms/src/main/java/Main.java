
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
        System.out.println(Arrays.toString(array));
        String[] array2 = {"About", "Test", "Here", "Talk"};
        sort(array2);
        System.out.println(Arrays.toString(array2));
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(4);
        intList.add(29);
        sortIntegers(intList);
        System.out.println(intList);
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Becaues");
        stringList.add("jafe");
        stringList.add("Jesm");
        sortStrings(stringList);
        System.out.println(stringList);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
