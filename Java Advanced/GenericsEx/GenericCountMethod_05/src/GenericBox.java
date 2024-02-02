public class GenericBox <T extends Comparable<T>> implements Comparable<GenericBox<T>>{
    private T data;

    public GenericBox(T data) {
        this.data = data;
    }

    @Override
    public int compareTo(GenericBox<T> o) {
        return this.data.compareTo(o.data);
    }
}
