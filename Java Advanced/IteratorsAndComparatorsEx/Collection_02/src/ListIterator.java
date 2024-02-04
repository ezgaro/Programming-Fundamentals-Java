import java.util.Iterator;
import java.util.List;

public class ListIterator implements Iterable<String> {
    private List<String> elements;
    private int currentIndex;

    public ListIterator(List<String> elements) {
        this.elements = elements;
        this.currentIndex = 0;
    }

    public boolean move() {
        if (hasNext()) {
            this.currentIndex++;
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        return this.currentIndex < this.elements.size();
    }

    public void print() {
        if (this.elements.isEmpty()) {
            throw new IllegalStateException("Invalid Operation!");
        }
        System.out.println(this.elements.get(this.currentIndex));
    }

    @Override
    public Iterator<String> iterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator<String> {
        int index = 0;


        @Override
        public boolean hasNext() {
            return index < elements.size();
        }

        @Override
        public String next() {
            return elements.get(index++);
        }
    }
}