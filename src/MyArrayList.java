import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> {

    private int capacity = 10;
    private int size = 0;
    private Object[] array = new Object[capacity];

    public MyArrayList() {
    }

    public MyArrayList(int capacity) {
        if (capacity > this.capacity) {
            this.capacity = capacity;
        }
    }

    public void add(T o) {
        ensureCapacity();
        array[size] = o;
        size++;
    }

    public void add(int index, T o) {
        ensureCapacity();
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = o;
        size++;
    }

    public void addAll(Object[] o) {
        for (int i = 0; i < o.length; i++) {
            ensureCapacity();
            array[size] = o[i];
            size++;
        }
    }

    public void addAll(int index, Object[] o) {
        for (int i = 0; i < o.length; i++) {
            ensureCapacity();
            for (int j = size; j > index; j--) {
                array[j] = array[j - 1];
            }
            array[index] = o[i];
            size++;
            index++;
        }
    }

    public T get(int index) {
        return (T) array[index];
    }

    public boolean remove(int index) {
        if (size * 2 < capacity) {
            capacity = capacity / 2;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return true;
    }

    public int size() {
        return size;
    }

    public boolean contains(Object o) {
        for (Object carFor : array) {
            if ((o.hashCode() == carFor.hashCode()) && (o.equals(carFor))) {
                return true;
            }
        }
        return false;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                return (T) array[index++];
            }
        };
    }

    public void ensureCapacity() {
        if (size >= capacity) {
            capacity = (array.length * 2) + 1;
            array = Arrays.copyOf(array, capacity);
        }
    }
}
