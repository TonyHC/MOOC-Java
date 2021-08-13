package dictionary;

public class Main {
    public static void main(String[] args) {
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        
        dictionary.load();
        
        dictionary.add("guik", "guilt");
        dictionary.add("apalk", "mon");
        dictionary.add("alla oleva", "below");
        dictionary.add("olut", "beer");
        dictionary.add("eno", "end");
        
        //dictionary.delete("monkey");
        
        dictionary.add("guik", "guilt");
        
        dictionary.save();
    }
}
