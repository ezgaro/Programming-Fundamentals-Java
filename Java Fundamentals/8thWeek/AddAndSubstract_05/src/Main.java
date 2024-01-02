import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int sumOfNumbers = sum(number1 , number2);
        int subtract = subtract(sumOfNumbers , number3);
        System.out.println(subtract);

    }

    public static int sum(int number1 , int number2) {
        return number1 + number2;
    }

    public static int subtract(int number1 , int number2) {
        return number1 - number2;
    }
}