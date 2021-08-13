
public class Program {

    public static void main(String[] args) {
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));

        int[] nums = {8, -2, 3, 1, 1};
        System.out.println(sum(nums, 0, nums.length, 0, 999));
    }

    public static int sum(int[] arr, int fromWhere, int toWhere, int smallest, int largest) {
        if(fromWhere < 0)
            fromWhere = 0;

        if(toWhere > arr.length)
            toWhere = arr.length;

        int sum = 0;
        for(int i = fromWhere; i < toWhere; i++) {
            if(arr[i] >= smallest && arr[i] <= largest)
                sum += arr[i];
        }

        return sum;
    }
}
