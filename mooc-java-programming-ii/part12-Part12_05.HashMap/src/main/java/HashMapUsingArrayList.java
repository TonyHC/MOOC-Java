import java.util.ArrayList;

public class HashMapUsingArrayList<K,V> {
    private ArrayList<Pair<K,V>>[] values;
    private int firstFreeIndex;
    
    public HashMapUsingArrayList() {
        this.values = new ArrayList[32];
        this.firstFreeIndex = 0;
    }
    
    public HashMapUsingArrayList(int capacity) {
        this.values = new ArrayList[capacity];
        this.firstFreeIndex = 0;
    }
    
    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if(values[hashValue] == null)
            return null;
        
        ArrayList<Pair<K,V>> valuesAtIndex = this.values[hashValue];
        
        for(int i = 0; i < valuesAtIndex.size(); i++) {
            if(valuesAtIndex.get(i).getKey().equals(key))
                return valuesAtIndex.get(i).getValue();
        }
        
        return null;
    }
    
    public void add(K key, V value) {
        ArrayList<Pair<K,V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);
        
        if(index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }
        
        if(1.0 * this.firstFreeIndex / this.values.length > 0.75)
            grow();
    }
    
    private ArrayList<Pair<K,V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if(values[hashValue] == null)
            values[hashValue] = new ArrayList<>();
        
        return values[hashValue];
    }
    
    private int getIndexOfKey(ArrayList<Pair<K,V>> keyValuesPair, K key) {
        for(int i = 0; i < keyValuesPair.size(); i++) {
            if(keyValuesPair.get(i).getKey().equals(key))
                return i;
        }
        
        return -1;
    }
    
    private void grow() {
        ArrayList<Pair<K,V>>[] newValues = new ArrayList[this.values.length * 2];
        
        for(int i = 0; i < values.length; i++) 
            copy(newValues, i);
        
        this.values = newValues;
    }

    private void copy(ArrayList<Pair<K,V>>[] newValues, int fromIndex) {
        try {
            for (int i = fromIndex; i < values[fromIndex].size(); i++) {
                Pair<K, V> keyValuePair = values[fromIndex].get(i);

                int hashValue = Math.abs(keyValuePair.getKey().hashCode() % newValues.length);
                if (newValues[hashValue] == null)
                    newValues[hashValue] = new ArrayList<Pair<K, V>>();

                newValues[hashValue].add(keyValuePair);
            }
        } catch (NullPointerException exception) {

        }
    }

    public V remove(K key) {
        ArrayList<Pair<K,V>> keyValuePairs = getListBasedOnKey(key);
        if(keyValuePairs.size() == 0)
            return null;

        int index = getIndexOfKey(keyValuePairs, key);
        if(index < 0)
            return null;

        Pair<K,V> keyValuePair = keyValuePairs.get(index);
        keyValuePairs.remove(keyValuePair);
        return keyValuePair.getValue();
    }
}
