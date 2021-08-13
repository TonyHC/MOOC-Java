public class Hideout<T> {
    private T object;

    public void putIntoHideout(T toHide) {
        this.object = toHide;
    }

    public T takeFromHideout() {
        if(this.object == null)
            return null;

        T obj = this.object;
        this.object = null;
        return obj;
    }

    public boolean isInHideout() {
        return this.object != null;
    }
}
