public class List<Type> {
    private Type[] values;
    private int firstFreeIndex;

    // We initialize and create a List using a Generic Array of fixed size (10), and have a int variable to keep track of
    // the number of elements added to the List
    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    // We initialize and create a List using a Generic Array of input size, and have a int variable to keep track of
    // the number of elements added to the List
    public List(int capacity) {
        this.values = (Type[]) new Object[capacity];
        this.firstFreeIndex = 0;
    }

    // Add a value to the Generic List. If List is full, expand the List using grow()
    public void add(Type value) {
        if(this.firstFreeIndex == this.values.length)
            grow();

        this.values[firstFreeIndex] = value;
        this.firstFreeIndex++;
    }

    // Expands the List size by 1.5 times the original List size
    private void grow() {
        Type[] newValues = (Type[]) new Object[this.values.length + this.values.length / 2];
        for(int i = 0; i < this.values.length; i++)
            newValues[i] = this.values[i];

        this.values = newValues;
    }

    // Checks whether a particular element in the List exists or not
    public boolean contains(Type value) {
        return indexOfValue(value) >= 0;
    }

    // Returns the index of a searched input. If searched input exists, then return index in List.
    // Otherwise, return -1, indicating it does not exist in List.
    public int indexOfValue(Type value) {
        for(int i = 0; i < this.firstFreeIndex; i++) {
            if(this.values[i].equals(value))
                return i;
        }

        return -1;
    }

    // Shifts all the values in List starting from the removal value position
    private void shiftValuesToTheLeft(int fromIndex) {
        for(int i = fromIndex; i < this.firstFreeIndex - 1; i++)
            this.values[i] = this.values[i + 1];
    }

    // Removes a element in the List only if the input value exists in the List, we call the shiftValuesToTheLeft()
    // based on the input value, and decrement firstFreeIndex by one
    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);
        if(indexOfValue < 0)
            return;

        shiftValuesToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }

    // Searches and returns whether a value exists in the List or not
    public Type searchForValue(int index) {
        if(index < 0 || index >= this.firstFreeIndex)
            throw new ArrayIndexOutOfBoundsException();

        return this.values[index];
    }

    // Returns the size of List based on the number of elements added to the List
    public int size() {
        return this.firstFreeIndex;
    }
}
