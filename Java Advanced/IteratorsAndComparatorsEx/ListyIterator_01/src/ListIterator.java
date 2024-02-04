import java.util.List;
import java.util.NoSuchElementException;

public class ListIterator {
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
}