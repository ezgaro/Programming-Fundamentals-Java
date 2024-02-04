import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomStack implements Iterable<Integer> {
    private Integer[] elements;
    private int curIndex;

    public CustomStack() {
        this.elements = new Integer[20];
        this.curIndex = 0;
    }

    public void push(int element) {
        this.elements[this.curIndex++] = element;
    }

    public Integer pop() {
        if (this.curIndex == 0) {
            System.out.println("No elements");
            return null;
        }
        return this.elements[--this.curIndex];
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = curIndex - 1;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return elements[index--];
            }
        };
    }
}