import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstInput = Double.parseDouble(scanner.nextLine());
        int secondInput = Integer.parseInt(scanner.nextLine());
        System.out.println(mathPower(firstInput, secondInput));
    }

    private static double mathPower(double firstInput, int secondInput) {
        double result = 1;
        for(int i = 0 ; i < secondInput ; i++) {
            result = result * firstInput;
        }
        return result;
    }
}