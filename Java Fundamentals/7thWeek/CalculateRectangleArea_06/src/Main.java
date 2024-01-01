import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        System.out.println(recArea(width , height));
    }
    public static int recArea(int width , int height) {
        return width * height;
    }
}