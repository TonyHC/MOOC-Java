
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for(int i = 0; i < array.length; i++) {
            if(smallest > array[i]) 
                smallest = array[i];
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = 0;
        int smallest = array[0];
        for(int i = 0; i < array.length; i++) {
            if(smallest > array[i])  {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        
        return indexOfSmallest;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexOfSmallest = 0;
        int smallest = table[startIndex];
        for(int i = startIndex; i < table.length; i++) {
            if(smallest >= table[i]) {
                smallest = table[i];
                indexOfSmallest = i;
            }
        }
        
        return indexOfSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int tmpHolder = array[index1];
        array[index1] = array[index2];
        array[index2] = tmpHolder;
    }
    
    /*
        Selection Sort Algorithm: 0 (smallest value) ... n (largest value)
    */
    public static void sort(int[] array) {
        int currentSmallest = 0;
        for(int i = 0; i < array.length; i++) {
            currentSmallest = indexOfSmallestFrom(array, i);
            swap(array, i, currentSmallest);
            System.out.println(Arrays.toString(array));
        }
    }
}
