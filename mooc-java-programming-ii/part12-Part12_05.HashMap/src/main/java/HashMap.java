
public class HashMap<K, V> {
    private List<Pair<K, V>>[] values;
    private int firstFreeIndex;

    // We initialize and create an Array of List containing Pair<K,V> objects of fixed size (32), and have a int variable
    // to keep track of the number of Pair<K,V> objects added to the Array of List
    public HashMap() {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }

    // We initialize and create an Array of List containing Pair<K,V> objects of fixed size (32), and have a int variable
    // to keep track of the number of Pair<K,V> objects added to the Array of List
    public HashMap(int capacity) {
        this.values = new List[capacity];
        this.firstFreeIndex = 0;
    }

    // We first calculate the hash value of key passed in and check whether the index (hash value calculated) of
    // Array of List is null. If this case is true, then we exit the function. Otherwise, we retrieved that
    // List<Pair<K,V>> possibly containing the key passed in. We then iterate through all the key=value pairs, and
    // check if key exists or not. If key exists, then we return the value associated with key. Otherwise, we exit the function.
    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (values[hashValue] == null)
            return null;

        List<Pair<K, V>> valuesAtIndex = this.values[hashValue];

        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.searchForValue(i).getKey().equals(key))
                return valuesAtIndex.searchForValue(i).getValue();
        }

        return null;
    }

    // We retrieve the List<Pair<K,V>> and index in Array of List containing the key. There are then two cases to check
    // for. The first case is when the key does not exist. In this case, we create and add a new key-value pair to
    // current List<Pair<K,V>> and increment the number of slots filled in the Array of List. The second case is when
    // the key does exist. For this case, we update the value of current key passed in for that List<Pair<K,V>>.
    // Finally, we check if the number of slots filled in the Array of List exceeds 75% filled. If true, we called
    // the grow() to expand double the size of Array of List.
    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.searchForValue(index).setValue(value);
        }

        if (1.0 * this.firstFreeIndex / this.values.length > 0.75)
            grow();
    }

    // We first calculate the hash value for current key passed in and check if the index (hash value calculated)
    // of Array of List exists or not. If it exists, then we just return that List<Pair<K,V>>. Otherwise, create
    // a new List<Pair<K,V>> based on hash value calculated from key passed in.
    private List<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (values[hashValue] == null)
            values[hashValue] = new List<Pair<K, V>>();

        return values[hashValue];
    }

    // Check if the key exists in the List<Pair<K,V>> passed in. If it exists, then we return the index.
    // Otherwise, return -1 indicating that key does not exist
    private int getIndexOfKey(List<Pair<K, V>> keyValuePairs, K key) {
        for (int i = 0; i < keyValuePairs.size(); i++) {
            if (keyValuePairs.searchForValue(i).getKey().equals(key))
                return i;
        }

        return -1;
    }

    // We expand the Array of List to double of the size of old Array of List. Then, we copy all the key-value pairs
    // in each Pair<K,V> object tp the new Array of List. Lastly, we have the instance variable of Array of List to
    // point to the new Array of List.
    private void grow() {
        List<Pair<K, V>>[] newValues = new List[this.values.length * 2];

        for (int i = 0; i < this.values.length; i++) {
            copy(newValues, i);
        }

        this.values = newValues;
    }

    // We copy all the key-value pairs in each Pair<K,V> object tp the new Array of List by doing the following.
    // First, we recalculate the hash value and retrieve a key from current Pair<K,V>. Next, we check if in the
    // new Array of List, whether at current index is null or not. If it is null, then we create a new
    // List<Pair<K,V>> to store key-value pairs. Otherwise, if that particular index in new Array Of List is
    // not null (based on hash value), we add the retrieved key-value to that particular index. Lastly, if current
    // index of old Array of List does not contain any key-value pairs, then we skip it and move to the next index.
    // A try-catch is need in order to skip any List<Pair<K,V>> containing no key-value pairs, inorder to avoid
    // the NullPointerException where that particular position in Array of List is currently null (cannot access its size)
    private void copy(List<Pair<K, V>>[] newValues, int fromIndex) {
        try {
            for (int i = 0; i < this.values[fromIndex].size(); i++) {
                Pair<K, V> keyValuePair = this.values[fromIndex].searchForValue(i);

                int hashValue = Math.abs(keyValuePair.getKey().hashCode() % newValues.length);
                if (newValues[hashValue] == null)
                    newValues[hashValue] = new List<Pair<K, V>>();

                newValues[hashValue].add(keyValuePair);
            }
        } catch (NullPointerException exception) {

        }
    }

    // We retrieve the List<Pair<K,V>> containing that key and check if size whether the size of ist<Pair<K,V>>
    // is 0. If it is size 0 (no key-value pairs), then we exit out of the function. Next, we retrieve the index where the key is location, and
    // check if index less than 0 (key does not exist), then we exit the function. If the above two checks are cleared,
    // then we retrieve that key-value pair based on key and remove it from List<Pair<K,V>>.
    public V remove(K key) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex.size() == 0)
            return null;

        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0)
            return null;

        Pair<K, V> keyValuePair = valuesAtIndex.searchForValue(index);
        valuesAtIndex.remove(keyValuePair);
        return keyValuePair.getValue();
    }
}
