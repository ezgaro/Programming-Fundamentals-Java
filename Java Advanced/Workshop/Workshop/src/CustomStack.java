import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class CustomStack {
    private final int INITIAL_CAPACITY = 4;
    private int capacity;
    private int size;
    private int[] items;

    public CustomStack() {
        this.capacity = INITIAL_CAPACITY;
        this.items = new int[this.capacity];
    }

    public int getSize() {
        return this.size;
    }

    public void push(int element) {
        if(this.size == this.capacity) {
            resize();
        }
        this.items[size++] = element;
    }

    public int pop() {
        checkIsEmpty();
        int element = this.items[size - 1];
        this.items[size - 1] = 0;
        return element;
    }

    public int peek() {
        checkIsEmpty();
        return this.items[size - 1];
    }

    public void forEach(Consumer<Integer> consumer) {
        for(int i = 0 ; i < this.size ; i++) {
            consumer.accept(this.items[i]);
        }
    }

    private void checkIsEmpty() {
        if(this.size == 0) {
            throw new NoSuchElementException("CustomStack is empty!");
        }
    }

    private void resize() {
        this.capacity *= 2;
        int[] copy = new int[this.capacity];
        for (int i = 0 ; i < this.size ; i++) {
            copy[i] = this.items[i];
        }
        this.items = copy;
    }
}
