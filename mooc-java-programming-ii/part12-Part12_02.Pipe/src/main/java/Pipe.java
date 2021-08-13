import java.util.ArrayList;

public class Pipe<T> {
    ArrayList<T> pipe;

    public Pipe() {
        this.pipe = new ArrayList<T>();
    }

    public void putIntoPipe(T value) {
        this.pipe.add(value);
    }

    public T takeFromPipe() {
        if(this.pipe.size() == 0)
            return null;

        T obj = this.pipe.get(0);
        this.pipe.remove(0);
        return obj;
    }

    public boolean isInPipe() {
        return this.pipe.size() != 0;
    }
}
