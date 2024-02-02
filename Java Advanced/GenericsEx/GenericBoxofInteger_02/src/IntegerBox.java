public class IntegerBox <T>{
    private T data;

    public IntegerBox(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("%s: %s" , this.data.getClass().getName() , this.data);
    }
}
