

public class GenericList<T> {
    public Object[] items = new Object[10];
    public int count;

    public void add(T item) { items[count++] = item; }

    @SuppressWarnings("unchecked")
    public T get(int index) { return (T) items[index]; }
}
