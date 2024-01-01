import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String order = scanner.nextLine();
        int numberOfOrders = Integer.parseInt(scanner.nextLine());
        orders(order , numberOfOrders);
    }

    public static void orders (String text , int order) {
        if(text.equals("coffee")) {
            System.out.println(order * 1.50);
        } else if (text.equals("water")) {
            System.out.println(order * 1.00);
        } else if (text.equals("coke")) {
            System.out.println(order * 1.40);
        } else if (text.equals("snacks")) {
            System.out.println(order * 2.00);
        }
    }
}