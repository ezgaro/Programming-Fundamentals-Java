import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        char operation = scanner.nextLine().charAt(0);
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(calculate(firstNumber, operation, secondNumber));
    }

    private static int calculate(int firstNumber, char operation, int secondNumber) {
        int result = 0;
        switch (operation) {
            case '*' :
                result = multiplication(firstNumber , secondNumber);
                break;
            case '/' :
                result = division(firstNumber , secondNumber);
                break;
            case '+' :
                result =sum(firstNumber , secondNumber);
                break;
            case '-' :
                result = minus(firstNumber , secondNumber);
                break;
        }
        return result;
    }

    private static int minus(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    private static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private static int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    private static int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}