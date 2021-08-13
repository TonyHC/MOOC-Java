
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("f.e", "for example");
        hashMap.put("etc.", "and so on");
        hashMap.put("i.e", "more precisely");
        
        printKeys(hashMap);
        System.out.println("---");
        printKeysWhere(hashMap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashMap, ".e");
        System.out.println("---");
    }
    
    public static void printKeys(HashMap<String, String> hashmap) {
        for(String keyName : hashmap.keySet()) {
            System.out.println(keyName);
        }
    }
    
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for(String keyName : hashmap.keySet()) {
            if(keyName.contains(text))
                System.out.println(keyName);
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for(String keyName : hashmap.keySet()) {
            if(keyName.contains(text)) 
                System.out.println(hashmap.get(keyName));
        }
    }
}
