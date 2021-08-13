
public class Program {
    public static void main(String[] args) {
        List<String> myList = new List<>();

        System.out.println(myList.contains("hello"));
        myList.add("hello");
        myList.add("world");
        System.out.println(myList.contains("hello"));

        int index = myList.indexOfValue("hello");
        System.out.println("\nIndex of searched value: " + index + "\n");

        for(int i = 0; i < myList.size(); i++)
            System.out.print(myList.searchForValue(i) + " ");

        System.out.println("\n\n" + myList.searchForValue(index));
        myList.remove("hello");
        System.out.println(myList.contains("hello") + "\n");

        for(int i = 0; i < myList.size(); i++)
            System.out.print(myList.searchForValue(i) + " ");
    }
}
