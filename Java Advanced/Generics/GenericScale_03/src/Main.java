public class Main {
    public static void main(String[] args) {
        Scale<String> scale = new Scale<>("a" , "c");
        System.out.println(scale.getHeavier());
    }
}