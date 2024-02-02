import java.util.*;

public class CustomList<T extends Comparable<T>>  implements Iterable<T>{
    private List<T> data;

    public CustomList() {
        this.data = new ArrayList<>();
    }

    public void add(T element) {
        this.data.add(element);
    }

    public T remove(int index) {
        checkIndex(index);
        T element = this.data.get(index);
        this.data.remove(index);
        return element;
    }

    public void swap(int index1 , int index2) {
        checkIndex(index1);
        checkIndex(index2);
        T elem1 = this.data.get(index1);
        T elem2 = this.data.get(index2);
        this.data.set(index2 , elem1);
        this.data.set(index1 , elem2);
    }
    public boolean contains(T element) {
        return this.data.contains(element);
    }

    public int countGreaterThan(T element) {
        int count = 0;
        for(T e : this.data) {
            int res = e.compareTo(element);
            if(res > 0) {
                count++;
            }
        }
        return count;
    }

    public T getMax() {
        checkEmpty();
        return Collections.max(this.data);
    }

    public T getMin() {
        checkEmpty();
        return Collections.min(this.data);
    }

    private void checkEmpty() {
        if(this.data.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
    }


    private void checkIndex(int index) {
        if(index < 0 || index > this.data.size()) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return this.index < data.size();
            }

            @Override
            public T next() {
                return data.get(index++);
            }
        };
    }
}
